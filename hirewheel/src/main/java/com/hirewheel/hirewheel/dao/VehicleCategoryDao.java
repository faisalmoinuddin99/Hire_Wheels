package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleCategoryDao extends JpaRepository<VehicleCategory, Integer> {
}
