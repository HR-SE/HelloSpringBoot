package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class UserService {
    private ArrayList<User> users = new ArrayList<>();
    public String createUser(User user) {
        users.add(user);
        return "User created: " + user.getName() + ", " + user.getEmail();
    }
    public ArrayList<User> getUsers() {
        return users;
    }
    public String deleteUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                users.remove(i);
                return "User " + name + " deleted.";
            }
        }
        return "User " + name + " not found.";
    }
}
