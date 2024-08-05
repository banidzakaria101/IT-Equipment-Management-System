package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.EquipmentStatus;
import model.enums.EquipmentType;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private EquipmentType type;
    private EquipmentStatus status;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<Ticket> tickets;



}
