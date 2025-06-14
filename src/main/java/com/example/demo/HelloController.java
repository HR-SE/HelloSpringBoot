package com.example.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

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
    }
