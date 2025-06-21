package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_users")
public class AppUser {
    @Id
    private String name;
    private String email;
    private int age;
    public AppUser() {}
    public AppUser(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public void setEmail(String email) { this.email = email; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}