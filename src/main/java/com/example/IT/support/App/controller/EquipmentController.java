package com.example.IT.support.App.controller;

import com.example.IT.support.App.services.EquipmentService;
import com.example.IT.support.App.model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @PostMapping("/add")
    public Equipment addEquipment(@RequestBody Equipment equipment){
        return equipmentService.addEquipment(equipment);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipment(@PathVariable Long id){
        equipmentService.deleteEquipmentById(id);
    }

    @GetMapping("/list")
    public List<Equipment> getAllEquipments(){
        return equipmentService.listAllEquipments();
    }



}
