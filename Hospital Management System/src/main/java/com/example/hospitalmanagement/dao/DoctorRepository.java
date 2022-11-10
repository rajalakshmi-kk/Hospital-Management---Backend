package com.example.hospitalproject.hospitalmanagement.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospitalproject.hospitalmanagement.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, String>{
	
													public Optional<Doctor> findByDocId(String docId);
													
													public Doctor findByDoctorName(String doctorName);
												
													public void deleteById(String docId);
}
