package controller;

import model.Technician;
import model.Ticket;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.TechnicianService;
import services.TicketService;
import services.UserService;

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

    @PostMapping("/user/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/user/delete")
    public void deleteUser(@RequestBody User user){
        userService.deleteUser(user);
    }

    @GetMapping("/user/name")
    public User getUser(@RequestBody User user){
        return userService.findUserByName(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.listAllUsers();
    }

    @PostMapping("/technician/add")
    public Technician addTechnician(@RequestBody Technician technician){
        return technicianService.add(technician);
    }

    @GetMapping("/delete/technician/{id}")
    public void deleteTechnician(@PathVariable Long id){
        technicianService.delete(id);
    }

    @PostMapping("/assign/ticket")
    public void assignTicket(@RequestParam Long ticketId, @RequestParam Long technicianId){
        Ticket ticket1 = ticketService.getTicket(ticketId);
        Technician technician = technicianService.getTechnician(technicianId);
    }



}
