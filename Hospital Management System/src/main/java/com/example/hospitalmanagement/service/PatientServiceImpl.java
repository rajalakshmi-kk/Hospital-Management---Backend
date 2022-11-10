package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalproject.hospitalmanagement.dao.PatientRepository;
import com.example.hospitalproject.hospitalmanagement.entity.Patient;



@Service
public class PatientServiceImpl implements PatientService{
	PatientRepository patientRepo;
	
	@Autowired
	public PatientServiceImpl(PatientRepository patientRepo) {
		this.patientRepo = patientRepo;
	}

	@Override
	public List<Patient> findAllPatient() {
		return patientRepo.findAll();
	}

	@Override
	public Patient update(Patient patient) {		
		Patient patients = patientRepo.save(patient);
		return patients;
	
}
	@Override
	public void save(Patient thePatient) {
		patientRepo.save(thePatient);
	}

	@Override
	public String deleteByPatientId(String thePatientId) throws Exception {
		Patient patient = findByPatientId(thePatientId);
		
		if(patient==null)
		{
			throw new Exception("patient id not found : "+thePatientId);
		}
		patientRepo.deleteByPatientId(thePatientId);
		
		return "Deleted patient id : "+thePatientId;
	}

	@Override
	public Patient findByPatientId(String patientId) throws Exception {
		Optional<Patient> result = patientRepo.findById(patientId);
		
		Patient thePatient=null;
		if(result.isPresent())
		{
			thePatient = result.get();
		}
		else {
			throw new Exception("patient id not found : "+patientId);
		}
		return thePatient;
	}
	
}
