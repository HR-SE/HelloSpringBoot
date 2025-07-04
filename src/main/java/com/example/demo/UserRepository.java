package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<AppUser, String>, JpaRepository<AppUser, String> {
        List<AppUser> findByAge(int age); //custom method
    }
