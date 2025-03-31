package com.example.VehiTrack.repository;

import com.example.VehiTrack.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vehiRepository extends JpaRepository<Vehicle, Long> {

}
