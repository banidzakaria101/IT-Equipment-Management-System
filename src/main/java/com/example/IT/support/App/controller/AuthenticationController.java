package com.example.IT.support.App.controller;


import com.example.IT.support.App.model.User;
import com.example.IT.support.App.model.enums.Role;
import com.example.IT.support.App.repository.UserRepository;
import com.example.IT.support.App.security.JwtAuth;
import com.example.IT.support.App.services.CustomUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthenticationController {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/auth/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody User authenticationRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
        );
        User user = userRepository.findByUsername(authenticationRequest.getUsername());
        List<Role> roles = user.getRoles();
        String token = JwtAuth.generateToken(authenticationRequest.getUsername(), roles);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return ResponseEntity.ok(response);
    }



}