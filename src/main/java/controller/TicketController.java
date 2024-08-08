package controller;

import services.TicketService;
import model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/assign")
    public Ticket assignTicket(@RequestParam Long ticketId, @RequestParam Long technicianId) {
        return ticketService.assignTicket(ticketId, technicianId);
    }

    @GetMapping("/list")
    public List<Ticket> listTickets() {
        return ticketService.getAllTickets();
    }


}
