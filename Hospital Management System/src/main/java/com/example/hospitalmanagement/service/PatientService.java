package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;

import com.example.hospitalproject.hospitalmanagement.entity.Patient;

public interface PatientService {
	
	
							public List<Patient> findAllPatient();
								
							public void save(Patient thePatient);
							
							public String deleteByPatientId(String patientId) throws Exception;
							
							public Patient findByPatientId(String patientId) throws Exception;
						
							Patient update(Patient patient);
							

}
