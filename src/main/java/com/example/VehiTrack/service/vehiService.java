package com.example.VehiTrack.service;

import com.example.VehiTrack.model.Vehicle;
import com.example.VehiTrack.model.VehicleDetails;
import com.example.VehiTrack.repository.vehiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class vehiService {

    @Autowired
    private vehiRepository vehirepository;

    public Vehicle registerVehicles(Vehicle vehicle){

        String apiUrls = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=ABC1234"+ vehicle.getPlaca();

        RestTemplate restTemplate = new RestTemplate();
        VehicleDetails vehicleDetails = restTemplate.getForObject(apiUrls , VehicleDetails.class);

        return vehirepository.save(vehicle);

        if (vehicleDetails != null){
            vehicle.setMarca(vehicleDetails.getMarca());
            vehicle.setModelo(vehicleDetails.getModelo());
            vehicle.setChassi(vehicleDetails.getChassi());
            vehicle.setLicenciado(vehicleDetails.getL);
        }
    }
}
