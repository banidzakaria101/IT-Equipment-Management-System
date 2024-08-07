package controller;

import services.EquipmentService;
import model.Breakdown;
import model.Employee;
import model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BreakdownService;

import java.util.Optional;

@RestController
@RequestMapping("/breakdowns")
public class BreakdownController {

    @Autowired
    private BreakdownService breakdownService;

    @Autowired
    private EquipmentService equipmentService;

    @PostMapping("/report")
    public Breakdown reportBreakdown(@RequestParam Long equipmentId, @RequestParam Long employeeId, @RequestBody String description) {
        Optional<Equipment> equipment = equipmentService.findById(equipmentId);
        Employee employee = new Employee(); // Load employee by ID from your employee service or repository

        return breakdownService.reportBreakdown(equipment, employee, description);
    }
}
