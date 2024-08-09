package com.example.IT.support.App.repository;


import com.example.IT.support.App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(User user);
}
