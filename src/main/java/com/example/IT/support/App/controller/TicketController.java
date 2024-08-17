package com.example.IT.support.App.controller;

import com.example.IT.support.App.services.EmployeeService;
import com.example.IT.support.App.services.TicketService;
import com.example.IT.support.App.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/create")
    public Ticket createTicket(@RequestParam Long employeeId, @RequestBody Ticket ticket) {
        return ticketService.createTicket(employeeId, ticket);
    }

    @PostMapping("/assign")
    public Ticket assignTicket(@RequestParam Long ticketId, @RequestParam Long technicianId) {
        return ticketService.assignTicket(ticketId, technicianId);
    }

    @GetMapping("/list")
    public List<Ticket> listTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/list/{employeeId}")
    public List<Ticket> listTicketsByEmployeeId(@PathVariable Long employeeId) {
        return ticketService.findTicketByEmployee(employeeId);
    }


}
