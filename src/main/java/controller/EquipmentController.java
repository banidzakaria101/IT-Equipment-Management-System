package controller;

import services.EquipmentService;
import model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @PostMapping(name = "/add")
    public Equipment addEquipment(@RequestBody Equipment equipment){
        return equipmentService.addEquipment(equipment);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipment(@RequestParam Long id){
        equipmentService.deleteEquipmentById(id);
    }

    @GetMapping(name = "/all")
    public List<Equipment> getAllEquipments(){
        return equipmentService.listAllEquipments();
    }



}
