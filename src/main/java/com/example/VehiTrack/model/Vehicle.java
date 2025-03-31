package com.example.VehiTrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String proprietario;

    @Column(nullable = false , unique = true)
    private int cpf;

    @Column(nullable = false , unique = true)
    private String placa;

}
