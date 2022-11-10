package com.example.hospitalproject.hospitalmanagement.dao;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.hospitalproject.hospitalmanagement.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{
	
						List<Appointment> findByDoctorName(String doctorName);
	
						List<Appointment> findByPatientName(String patientName);
	
					//	@Modifying 
					//	@Query("update appointment a set a.confirmed = ?1 where a.token_num = ?2")
//					public	String setAppointment(String appointmentDate, String doctorName);
//	

//	@Modifying 
//	@Query("update appointment a set a.prescription = ?1 where a.appointment_id = ?2")
//	int setPrescription(String prescription, Integer id);
	
	@Query(value="select * from appointment a where a.appointment_date =?1 AND a.doc_name =?2", nativeQuery=true)
	List<Appointment> findByAppointmentDate(Date appointmentDate);
	
	@Query(value = "select * appointment a where a.r_id =?", nativeQuery = true)
	public List<Appointment> findByReceptionistId(Integer rId);
	
	
	public String deleteByAppointmentDate(Date appointmentDate);
}
