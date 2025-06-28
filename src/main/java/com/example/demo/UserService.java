package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.data.domain.Sort;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String createUser(AppUser user) {
        if (user == null || user.getName() == null) {
            throw new IllegalArgumentException("User or name cannot be null");
        }
        userRepository.save(user);
        return "User created: " + user.getName() + ", " + user.getEmail() + ", Age : " + user.getAge();
    }

    public String updateUser(String name, AppUser userDetails) {
        if (userRepository.existsById(name)) {
            AppUser existingUser = userRepository.findById(name).get();
            existingUser.setEmail(userDetails.getEmail() != null ? userDetails.getEmail() : existingUser.getEmail());
            existingUser.setAge(userDetails.getAge() != 0 ? userDetails.getAge() : existingUser.getAge());
            userRepository.save(existingUser);
            return "User updated: " + name + ", " + existingUser.getEmail() + ", Age: " + existingUser.getAge();
        }
        return "User " + name + " not found.";
    }

    public Page<AppUser> getUsers(int page, int size, String sortBy, String sortDirection)
    {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(page, size, sort);
        return userRepository.findAll(pageable);
    }

    public List<AppUser> getUsersByAge(int age) {
        return userRepository.findByAge(age);
    }

    public String deleteUser(String name) {
        if (userRepository.existsById(name)) {
            userRepository.deleteById(name);
            return "User " + name + " deleted.";
            }
        return "User " + name + " not found.";
    }
}