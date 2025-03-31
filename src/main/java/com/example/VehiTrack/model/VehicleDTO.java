package com.example.VehiTrack.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDTO {

    private String marca;
    private String modelo;
    private String chassi;
    private boolean licenciado;
}
