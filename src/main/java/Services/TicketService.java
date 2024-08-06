package Services;

import Repository.TicketRepository;
import model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepo;

    public Ticket addTicket(Ticket ticket){
        return ticketRepo.save(ticket);
    }

    public void deleteTicket(Ticket ticket){
        ticketRepo.delete(ticket);
    }

    public Ticket findTicketByName(Ticket ticket){
        return ticketRepo.findTicketByName(ticket);
    }

    public List<Ticket> getAllTickets(){
        return ticketRepo.findAll();
    }

    public void deleteTicketById(Long id){
        ticketRepo.deleteById(id);
    }
}
