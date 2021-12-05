package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}
