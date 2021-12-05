package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}
