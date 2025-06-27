package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<AppUser, String> {
    List<AppUser> findByAge(int age); //custom method
}