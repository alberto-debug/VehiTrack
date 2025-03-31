package com.example.VehiTrack.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false,)
    private String proprietario;

    @Column(nullable = false , unique = true)
    private String cpf;

    @Column(nullable = false , unique = true)
    private String placa;

}
