package Controller;

import Repository.TicketRepository;
import Services.TicketService;
import model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping(name = "/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return ticketService.addTicket(ticket);
    }

    @DeleteMapping(name = "/delete")
    public void deleteTicket(@RequestParam Long id){
        ticketService.deleteTicketById(id);
    }

    @GetMapping(name = "/all")
    public List<Ticket> getAllTicket(){
        return ticketService.getAllTickets();
    }

}
