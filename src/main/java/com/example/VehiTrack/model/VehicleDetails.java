package com.example.VehiTrack.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehicleDetails {

    private String brand;
    private String model;
    private String chassi;
    private String licensed;

    public String getLicensed() {
        return licensed;
    }

    public void setLicensed(String licensed) {
        this.licensed = licensed;
    }
}
