package com.example.VehiTrack.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehicleDetails {

    private String brand;
    private String model;
    private String chassi;
    private boolean licensed;

    public boolean getLicensed() {
        return licensed;
    }

    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }
}
