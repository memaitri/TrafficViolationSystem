package com.smarttraffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smarttraffic.model.Violation;
import com.smarttraffic.repository.ViolationRepository;

@Service
public class TrafficService {

    @Autowired
    private ViolationRepository repo;

    public Violation process(String vehicleId, double speed, String zone) {
        if (speed <= 80) {
            return null;
        }

        int fine;
        if (speed > 120)      fine = 5000;
        else if (speed > 100) fine = 2000;
        else                  fine = 1000;

        Violation v = new Violation();
        v.setVehicleId(vehicleId);
        v.setSpeed(speed);
        v.setZone(zone);
        v.setFine(fine);
        v.setTimestamp(System.currentTimeMillis());

        return repo.save(v);
    }
}
