package com.example.hospitalproject.hospitalmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hospitalproject.hospitalmanagement.entity.Patient;
import com.example.hospitalproject.hospitalmanagement.service.PatientService;


@RestController
@RequestMapping("/patient")
public class PatientRestController {
	
	@Autowired
	private PatientService patientServe;
	public PatientRestController(PatientService patientServe) {
		super();
		this.patientServe = patientServe;
	}
	
	@GetMapping("/patients")
	public List<Patient> findAll()
	{
		return patientServe.findAllPatient();
	}
	
	//add mapping to retrieve single patient
		@GetMapping("/patients/{patientId}")
		public Patient findById(@PathVariable String patientId)
		{
			Patient patient = null;
			try {
				patient = patientServe.findByPatientId(patientId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return patient;
		}
		
		//add mapping for POST/patient - add new patient
		@PostMapping("/patients")
		public Patient addPatient(@RequestBody Patient thePatient)
		{
			thePatient.setPatientId("0");
			patientServe.save(thePatient);
			return thePatient;
		}
		
		//add mapping for PUT/patients - update an existing patient
		@PutMapping("/patients")
		public Patient updatePatient(@RequestBody Patient thePatient)
		{
			patientServe.save(thePatient);
			return thePatient;
		}
		
		//add mapping for DELETE/patient/{patientId} - delete an patient
		@DeleteMapping("patients/{patientId}")
		public String deletePatient(@PathVariable String patientId)//theId=5
		{
			String msg="";
			try {
				msg = patientServe.deleteByPatientId(patientId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return msg;
		}		
}
