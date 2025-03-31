package com.example.VehiTrack.service;

import com.example.VehiTrack.model.Vehicle;
import com.example.VehiTrack.model.VehicleDetails;
import com.example.VehiTrack.repository.VehiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class vehiService {

    @Autowired
    private VehiRepository vehiRepository;

    public Vehicle registerVehicles(Vehicle vehicle) {
        // Fetch vehicle details from external API
        String apiUrl = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=" + vehicle.getPlaca();
        RestTemplate restTemplate = new RestTemplate();
        VehicleDetails vehicleDetails = restTemplate.getForObject(apiUrl, VehicleDetails.class);

        if (vehicleDetails != null) {
            // Update vehicle object with details from API
            vehicle.setMarca(vehicleDetails.getMarca());
            vehicle.setModelo(vehicleDetails.getModelo());
            vehicle.setChassi(vehicleDetails.getChassi());
            vehicle.setLicenciado(vehicleDetails.getLicenciado());
        } else {
            throw new RuntimeException("Failed to fetch vehicle details from external API");
        }

        // Save the vehicle to the database
        return vehiRepository.save(vehicle);
    }
}
