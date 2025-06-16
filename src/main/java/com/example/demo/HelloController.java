package com.example.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class HelloController {
        private ArrayList<User> users = new ArrayList<>();

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, Himanshu! How r u today?";
        }

        @GetMapping("/test")
        public String test() {
            return "This is a test";
        }

        @GetMapping("/greet")
        public String greet() {
            return "Welcome to Spring Boot, himanshu!";
        }

        @GetMapping("/user/{name}")
        public String greetUser(@PathVariable String name) {
            return "Hello, " + name + "!";
        }

        @PostMapping("/user")
        public String createUser(@RequestBody User user) {
            users.add(user);
            return "User created: " + user.getName() + ", " + user.getEmail();
        }
        @GetMapping("/users")
        public ArrayList<User> getUsers() {
            return users;
        }
        @DeleteMapping("/user/{name}")
        public String deleteUser(@PathVariable String name) {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getName().equals(name)) {
                    users.remove(i);
                    return "User " + name + "deleted.";
                }
            }
            return "User " + name + " not found.";
        }
    }
