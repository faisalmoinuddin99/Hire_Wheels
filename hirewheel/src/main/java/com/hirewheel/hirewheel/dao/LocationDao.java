package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationDao extends JpaRepository<Location, Integer> {
}
