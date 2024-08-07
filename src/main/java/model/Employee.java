package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Employee extends User {
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "reportedBy", cascade = CascadeType.ALL)
    private List<Breakdown> reportedBreakdowns;
}
