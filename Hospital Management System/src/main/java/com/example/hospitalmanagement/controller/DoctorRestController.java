package com.example.hospitalproject.hospitalmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.hospitalproject.hospitalmanagement.entity.Doctor;
import com.example.hospitalproject.hospitalmanagement.service.DoctorService;

@Controller
@RequestMapping("/doctors")
public class DoctorRestController {
	
	@Autowired
	private DoctorService doctorServe;
	
	public DoctorRestController(DoctorService doctorServe) {
		super();
		this.doctorServe=doctorServe;
	}

	@GetMapping("/doctors")
	public List<Doctor> findAll()
	{
		return doctorServe.findAllDoctor();
	}
	
	//add mapping to retrieve single patient
			@GetMapping("/doctors/{docId}")
			public Doctor findById(@PathVariable String docId)
			{
				Doctor doctor = null;
				try {
					doctor = doctorServe.findByDocId(docId);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return doctor;
			}
			
	//add mapping for POST/doctor - add new doctor
			@PostMapping("/doctors")
			public Doctor addDoctor(@RequestBody Doctor theDoctor)
			{
				theDoctor.setDocId("0");
				doctorServe.save(theDoctor);
				return theDoctor;
			}
	
			
			//add mapping for PUT/doctors - update an existing doctor
			@PutMapping("/doctors")
			public Doctor updateDoctor(@RequestBody Doctor theDoctor)
			{
				doctorServe.save(theDoctor);
				return theDoctor;
			}
			
			//add mapping for DELETE/doctor/{docId} - delete an doctor
			@DeleteMapping("doctors/{docId}")
			public String deletePatient(@PathVariable String docId)//theId=5
			{
				String msg="";
				try {
					msg = doctorServe.deleteByDocId(docId);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return msg;
			}		
}
