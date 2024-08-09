package com.example.IT.support.App.services;

import com.example.IT.support.App.repository.EquipmentRepository;
import com.example.IT.support.App.model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Equipment findEquipmentById(Long id){
        return equipmentRepo.findById(id).get();
    }

    public List<Equipment> listAllEquipments(){
        return equipmentRepo.findAll();
    }

    public Optional<Equipment> findById(Long id) {
        return equipmentRepo.findById(id);
    }

//    public Equipment updateEquipment(Equipment equipment){
//        return equipmentRepo.u
//    }
}
