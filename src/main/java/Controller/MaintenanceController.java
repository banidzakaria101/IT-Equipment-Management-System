package Controller;

import Services.MaintenanceService;
import model.Equipment;
import model.Maintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/maintenance")
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @PostMapping("/add")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.addMaintenance(maintenance);
    }

    @DeleteMapping(name = "/delete/{id}")
    public void deleteMaintenance(@RequestParam Long id){
        maintenanceService.deleteMaintenanceById(id);

    }

    @GetMapping(name = "/list")
    public List<Maintenance> getAllMaintenances(){
        return maintenanceService.lisAll();
    }

    
}
