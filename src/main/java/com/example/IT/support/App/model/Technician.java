package com.example.IT.support.App.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("technician")
public class Technician extends User {
    private String specialization;

    @OneToMany(mappedBy = "technician", cascade = CascadeType.ALL)
    private List<Ticket> tickets;
    
}

