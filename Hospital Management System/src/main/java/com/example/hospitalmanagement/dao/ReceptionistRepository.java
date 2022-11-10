package com.example.hospitalproject.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hospitalproject.hospitalmanagement.entity.Receptionist;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Integer>{
	
}
