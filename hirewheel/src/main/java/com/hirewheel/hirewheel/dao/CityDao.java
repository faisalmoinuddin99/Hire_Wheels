package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
}
