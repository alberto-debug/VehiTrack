package com.example.VehiTrack.controller;

import com.example.VehiTrack.model.Vehicle;
import com.example.VehiTrack.service.vehiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class vehiController {

    @Autowired
    private vehiService vehiService;

    @PostMapping
    public ResponseEntity<Vehicle> registerVehicle(@RequestBody Vehicle vehicle) {
        Vehicle registeredVehicle = vehiService.registerVehicles(vehicle);
        return ResponseEntity.ok(registeredVehicle);
    }
}
