package com.example.hospitalproject.hospitalmanagement.service;

import java.sql.Date;
import java.util.List;

import com.example.hospitalproject.hospitalmanagement.entity.Appointment;

public interface AppointmentService {
									
									public List<Appointment> listAll();
									
									public Appointment save(Appointment appointment);
									
								  //  public String setAppointment(String date, String doctorName);
									
//									public String deleteAppointment();
									
									public String deleteAppointment(Date appointmentDate);
	
									public List<Appointment> findByPatientName(String patientName);
									
									public List<Appointment> findByDoctorName(String doctorName);
									
									public List<Appointment> findByDate(Date appointmentDate);
	
}
