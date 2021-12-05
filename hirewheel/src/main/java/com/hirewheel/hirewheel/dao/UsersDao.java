package com.hirewheel.hirewheel.dao;

import com.hirewheel.hirewheel.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersDao extends JpaRepository<Users, Integer> {

    List<Users> findByFirstName(String firstName) ;
    List<Users> findByFirstNameOrLastName(@Param("firstname")String firstName, @Param("lastname")String lastName) ;
    List<Users> findByEmail(@Param("email") String email) ;
    List<Users> findByMobileNumber(@Param("mobileNumber") String mobileNumber) ;
}
