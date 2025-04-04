package com.example.VehiTrack.repository;

import com.example.VehiTrack.model.Vehicle;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiRepository extends JpaRepository<Vehicle, Long> {
  Optional findById(String id);

}
