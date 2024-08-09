package com.example.IT.support.App.controller;

import com.example.IT.support.App.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.IT.support.App.services.EmployeeService;
import com.example.IT.support.App.services.TicketService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private TicketService ticketService;


    @GetMapping("/ticket/status")
    public Ticket getTicketStatus(@RequestParam Long employeeId) {
        return ticketService.getTicketStatus(employeeId);
    }



}
