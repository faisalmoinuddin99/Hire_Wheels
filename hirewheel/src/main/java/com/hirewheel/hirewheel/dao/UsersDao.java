package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users, Integer> {
}
