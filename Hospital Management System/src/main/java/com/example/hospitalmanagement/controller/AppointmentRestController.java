package com.example.hospitalproject.hospitalmanagement.controller;

import java.sql.Date;
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
import com.example.hospitalproject.hospitalmanagement.entity.Appointment;
import com.example.hospitalproject.hospitalmanagement.service.AppointmentService;

@RestController
@RequestMapping("/apointments")
public class AppointmentRestController {

	@Autowired
	private AppointmentService appointmentServe;

	public AppointmentRestController(AppointmentService appointmentServe) {
		super();
		this.appointmentServe = appointmentServe;
	}
	
				//add mapping for POST/apointments - add new apointment
//				@PostMapping("/apointments")
//				public Appointment addAppointment(@RequestBody Appointment theAppointment)
//				{
//					theAppointment.setTokenNum(0);
//					appointmentServe.save(theAppointment);
//					return theAppointment;
//				}
				
				//setting appointments
				@PostMapping("/appointments")
				public Appointment addAppointments(@RequestBody Appointment theAppointment) {
					Appointment appointment = appointmentServe.save(theAppointment);
					return appointment;
				
				}
				
		
				//showing all appointments
				@GetMapping("appointments")
				public List<Appointment> findAll(){
					return appointmentServe.listAll();
				}
		
		
				//add mapping for PUT/appointments - update an existing appointments
				@PutMapping("/appointments")
				public Appointment updateAppointment(@RequestBody Appointment theAppointment)
				{
					appointmentServe.save(theAppointment);
					return theAppointment;
				}
				
				
				//add mapping for DELETE/appointments/{delete} - delete an appointment
				@DeleteMapping("appointments/{appointmentDate}")
				public String deleteAppointment(@PathVariable Date appointmentDate)
				{
					String msg="appointment deleted";
					try {
						msg = appointmentServe.deleteAppointment(appointmentDate);
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					return msg;
				}	
	
}
