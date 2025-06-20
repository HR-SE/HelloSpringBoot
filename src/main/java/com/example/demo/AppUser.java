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
    public AppUser() {}
    public AppUser(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() { return name; }
    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email; }
    public void setName(String name) { this.name = name; }
}