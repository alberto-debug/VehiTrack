package com.example.VehiTrack.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDetails {

    private String marca;
    private String modelo;
    private String chassi;
    private boolean licenciado;

    public Boolean getLicenciado() {
        return licenciado;
    }

    public void setLicenciado(Boolean licenciado) {
        this.licenciado = licenciado;
    }
}
