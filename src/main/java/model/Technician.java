package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Technician extends User {
    private String specialization;

    @OneToMany(mappedBy = "technician", cascade = CascadeType.ALL)
    private List<Ticket> tickets;
    
}

