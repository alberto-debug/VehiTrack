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

    @NonNull
    private String owner;

    @Column(nullable = false, unique = true)
    private String identification;

    @Column(nullable = false, unique = true)
    private String placa;

    @NonNull
    private String brand;

    @NonNull
    private String model;

    @NonNull
    private String chassi;

    @Setter
    @Getter
    @NonNull
    private boolean licensed;
}
