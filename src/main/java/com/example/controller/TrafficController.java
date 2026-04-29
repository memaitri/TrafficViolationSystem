package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.model.Violation;
import com.example.service.TrafficService;
import com.example.repository.ViolationRepository;
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

        if (result == null) {
            return "No violation detected";
        }

        return result;
    }

    @GetMapping("/violations")
    public List<Violation> getAll() {
        return repo.findAll();
    }
}