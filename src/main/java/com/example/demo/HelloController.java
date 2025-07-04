package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
        public String createUser(@RequestBody AppUser user) {
            return userService.createUser(user);
        }

        @PutMapping("/user/{name}")
        public String updateUser(@PathVariable String name, @RequestBody AppUser userDetails)
        {return userService.updateUser(name, userDetails);}

        @GetMapping("/users")
        public Page<AppUser> getUsers(@RequestParam(defaultValue = "0") int page,
                                      @RequestParam(defaultValue = "5") int size,
                                      @RequestParam(defaultValue = "age") String sortBy,
                                      @RequestParam(defaultValue = "ASC") String sortDirection) {
            return userService.getUsers(page, size, sortBy, sortDirection);
        }

        @GetMapping("/users/age/{age}")
        public List<AppUser> getUsersByAge(@PathVariable int age) {
            return userService.getUsersByAge(age);
        }

        @DeleteMapping("/user/{name}")
        public String deleteUser(@PathVariable String name) {
                    return userService.deleteUser(name);
        }
}
