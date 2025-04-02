package com.example.VehiTrack.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehicleDetails {

    private String marca;
    private String modelo;
    private String chassi;
    private boolean licenciado;

    public String getMarca() {
        return marca;
    }

    public boolean getLicenciado() {
        return licenciado;
    }
}
