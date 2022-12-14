package com.example.hospitalproject.hospitalmanagement.dao;

import java.util.Optional;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospitalproject.hospitalmanagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, String>{

	

											public Optional<Patient> findById(String patientId);

											public void deleteByPatientId(String thePatientId);

//											public List<Patient> findAllByPatientIdAsc();
											
//											Method for get list of patients in descending order by token_Num 
//											public List<Patient> findAllByPatientIdDesc();
}
