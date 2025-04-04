package com.example.VehiTrack.model;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String owner;

    @Column(nullable = false, unique = true)
    private String identification;

    @Column(nullable = false, unique = true)
    private String placa;


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
