package com.example.VehiTrack.service;

import com.example.VehiTrack.model.Vehicle;
import com.example.VehiTrack.repository.VehiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class vehiService {

    @Autowired
    private VehiRepository vehiRepository;

    public Vehicle registerVehicle(Vehicle vehicle) {

        String apiURL= "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&" + Vehicle.get
        return null;
    }
}
