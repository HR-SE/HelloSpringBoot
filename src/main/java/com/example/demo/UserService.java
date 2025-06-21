package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

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
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
    public String deleteUser(String name) {
        if (userRepository.existsById(name)) {
            userRepository.deleteById(name);
            return "User " + name + " deleted.";
            }
        return "User " + name + " not found.";
    }
}
