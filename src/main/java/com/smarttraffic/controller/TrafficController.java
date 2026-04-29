package com.smarttraffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.smarttraffic.model.Violation;
import com.smarttraffic.service.TrafficService;
import com.smarttraffic.repository.ViolationRepository;
import java.util.List;

@RestController
@RequestMapping("/api/traffic")
@CrossOrigin
public class TrafficController {

    @Autowired
    private TrafficService service;

    @Autowired
    private ViolationRepository repo;

    @PostMapping("/check")
    public Object check(@RequestBody Violation input) {
        Violation result = service.process(
                input.getVehicleId(),
                input.getSpeed(),
                input.getZone());

        return result != null ? result : "No violation detected";
    }

    @GetMapping("/violations")
    public List<Violation> getAll() {
        return repo.findAll();
    }
}
