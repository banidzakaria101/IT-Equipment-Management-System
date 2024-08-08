package controller;

import services.BreakdownService;
import services.EquipmentService;
import model.Breakdown;
import model.Employee;
import model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        Equipment equipment = equipmentService.findEquipmentById(employeeId);
        Employee employee = new Employee();

        return breakdownService.reportBreakdown(equipment, employee, description);
    }

}
