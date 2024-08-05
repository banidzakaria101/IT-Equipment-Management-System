package Repository;

import model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    Equipment findByName(Equipment equipment);
}
