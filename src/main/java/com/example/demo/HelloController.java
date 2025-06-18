package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class HelloController {
        @Autowired
        private UserService userService;

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
            return userService.createUser(user);
        }
        @GetMapping("/users")
        public ArrayList<User> getUsers() {
            return userService.getUsers();
        }
        @DeleteMapping("/user/{name}")
        public String deleteUser(@PathVariable String name) {
                    return userService.deleteUser(name);
        }
}
