package com.techhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techhub.entity.Register;

@Repository("RegisterRepo")
public interface RegisterRepo extends JpaRepository<Register, Integer> {

}
