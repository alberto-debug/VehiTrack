package com.example.VehiTrack.service;

import com.example.VehiTrack.model.Vehicle;
import com.example.VehiTrack.repository.vehiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class vehiService {

    @Autowired
    private vehiRepository vehirepository;

    public Vehicle registerVehicles(Vehicle vehicle){

        return vehirepository.save(vehicle);
    }
}
