package com.example.VehiTrack.model;

import lombok.Getter;
import lombok.Setter;

public class VehicleDetails {

    private String marca;
    private String modelo;
    private String chassi;
    private boolean licenciado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public boolean isLicenciado() {
        return licenciado;
    }

    public void setLicenciado(boolean licenciado) {
        this.licenciado = licenciado;
    }

    public Boolean getLicenciado() {
        return licenciado;
    }

}
