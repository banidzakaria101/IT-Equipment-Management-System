package com.example.IT.support.App.services;

import com.example.IT.support.App.repository.UserRepository;
import com.example.IT.support.App.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User addUser(User user){
        return userRepo.save(user);
    }

    public User findUserById(Long id){
        return userRepo.findById(id).orElse(null);
    }

    public void deleteUser(User user){
        userRepo.delete(user);
    }

    public List<User> listAllUsers(){
        return userRepo.findAll();
    }

    public User findUserByUsername(String username){
        return  userRepo.findByUsername(username);
    }

}
