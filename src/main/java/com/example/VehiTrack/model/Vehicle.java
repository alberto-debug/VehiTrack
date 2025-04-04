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

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String chassi;

    @Column(nullable = false)
    private boolean licenciado;

    public boolean getLicenciado() {
        return licenciado;
    }

    public void setLicenciado(boolean licenciado) {
        this.licenciado = licenciado;
    }
}
