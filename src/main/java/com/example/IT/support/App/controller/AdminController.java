package com.example.IT.support.App.controller;

import com.example.IT.support.App.model.Technician;
import com.example.IT.support.App.model.Ticket;
import com.example.IT.support.App.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.IT.support.App.services.TechnicianService;
import com.example.IT.support.App.services.TicketService;
import com.example.IT.support.App.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

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



}
