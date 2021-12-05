package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDao extends JpaRepository<Vehicle, Integer> {
}
