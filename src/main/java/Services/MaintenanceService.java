package Services;

import Repository.MaintenanceRepository;
import model.Maintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceService{

    @Autowired
    MaintenanceRepository maintenanceRepo;

    public Maintenance addMaintenance(Maintenance maintenance){
        return maintenanceRepo.save(maintenance);
    }

    public void deleteMaintenance(Maintenance maintenance){
        maintenanceRepo.delete(maintenance);
    }


}
