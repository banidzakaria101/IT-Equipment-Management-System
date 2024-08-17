package com.example.IT.support.App.security;

import com.example.IT.support.App.model.enums.Role;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JwtAuth {
    public static final Key SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static String generateToken(String username, List<Role> roles) {
        System.out.println("///////////////////" + username + "GENERATETOKEN JWTAUTH");
        // Convert roles to a comma-separated string or handle them as needed
        String rolesClaim = roles.stream()
                .map(Role::name) // Convert each role to its name (or any other representation you prefer)
                .collect(Collectors.joining(","));

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))
                .claim("roles", rolesClaim)
                .signWith(SECRET_KEY, SignatureAlgorithm.HS256)
                .compact();
    }
}
