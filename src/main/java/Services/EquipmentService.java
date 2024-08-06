package Services;

import Repository.EquipmentRepository;
import model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepo;

    public Equipment addEquipment(Equipment equipment){
        return equipmentRepo.save(equipment);
    }

    public Equipment findEquipmentByName(Equipment equipment){
        return equipmentRepo.findByName(equipment);
    }

    public void deleteEquipment(Equipment equipment){
        equipmentRepo.delete(equipment);
    }

    public void deleteEquipmentById(Long id){
        equipmentRepo.deleteById(id);
    }

    public List<Equipment> listAllEquipments(){
        return equipmentRepo.findAll();
    }
}
