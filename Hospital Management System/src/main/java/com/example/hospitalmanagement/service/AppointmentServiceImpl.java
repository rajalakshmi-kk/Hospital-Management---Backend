package com.example.hospitalproject.hospitalmanagement.service;

import java.sql.Date;
import java.util.List;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalproject.hospitalmanagement.dao.AppointmentRepository;
import com.example.hospitalproject.hospitalmanagement.entity.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	@Autowired
	public AppointmentRepository bookAppointment;

	
	public AppointmentServiceImpl(AppointmentRepository bookAppointment) {
		super();
		this.bookAppointment=bookAppointment;
	}

	public List<Appointment> listAll(){
		return bookAppointment.findAll();
	}
	
	public Appointment save(Appointment appointment) {
		return bookAppointment.save(appointment);
	}
	
	
//	public int setConfirmation(String confirmation, Integer id) {
//		 return bookAppointment.setConfirmation(confirmation, id);
//	}
//	
//	
//	public int setPrescription(String confirmation, Integer id) {
//		 return bookAppointment.setPrescription(confirmation, id);
//	}
	
//	public Optional<Appointment> get(Integer id) {
//		return bookAppointment.findById(id);
//		
//	}
	
	public List<Appointment> findByPatientName(String patientName)
	{
		return bookAppointment.findByPatientName(patientName);
	}
	
	public List<Appointment> findByDoctorName(String doctorName)
	{
		return bookAppointment.findByDoctorName(doctorName);
	}
	
	public List<Appointment> findByDate(Date appointmentDate){
		return bookAppointment.findByAppointmentDate(appointmentDate);
	}

	
	@Override
	public String deleteAppointment(Date appointmentDate) {
		
		return bookAppointment.deleteByAppointmentDate(appointmentDate);
	}

//	@Override
//	public String setAppointment(String date, String doctorName) {
//		String appoint = bookAppointment.setAppointment(date, doctorName);
//		return appoint;
//	}


	
}
