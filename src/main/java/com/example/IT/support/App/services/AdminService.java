package com.example.IT.support.App.services;

import com.example.IT.support.App.model.Admin;
import com.example.IT.support.App.model.Ticket;
import com.example.IT.support.App.model.enums.Role;
import com.example.IT.support.App.repository.AdminRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/admin")
public class AdminService {

@Autowired
private AdminRepository adminRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Autowired
    private TechnicianService technicianService;

    @Autowired
    private TicketService ticketService;


    @PostMapping("/assign/ticket")
    public Ticket assignTicket(@RequestParam Long ticketId, @RequestParam Long technicianId){
       return ticketService.assignTicket(ticketId, technicianId);
    }



    @PostConstruct
    public void createAdminUserIfNotExist() {
        String adminName = "admin";
        Admin existingAdmin = adminRepository.findByUsername(adminName);
        if (existingAdmin == null) {
            Admin admin = new Admin();
            admin.setUsername(adminName);
            admin.setRoles(Collections.singletonList(Role.ROLE_ADMIN));
            admin.setPassword(passwordEncoder.encode("admin"));            adminRepository.save(admin);
        }
    }


}

