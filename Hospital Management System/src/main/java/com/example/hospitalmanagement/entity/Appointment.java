package com.example.hospitalproject.hospitalmanagement.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="appointment")
@DynamicUpdate
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="token_num")
	private Integer tokenNum; 
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="doc_name")
	private String doctorName;
	
	@Column(name="appointment_date")
	private Date appointmentDate;

	@ManyToOne
	private Receptionist  receptionist;
	
	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public Appointment() {
		super();
	}

	

	public Appointment(Integer tokenNum, String patientName, String doctorName, Date appointmentDate,
			Receptionist receptionist) {
		super();
		this.tokenNum = tokenNum;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.receptionist = receptionist;
	}

	public Integer getTokenNum() {
		return tokenNum;
	}

	public void setTokenNum(Integer tokenNum) {
		this.tokenNum = tokenNum;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "Appointment [tokenNum=" + tokenNum + ", patientName=" + patientName + ", doctorName=" + doctorName
				+ ", appointmentDate=" + appointmentDate + "]";
	}

	public List<Appointment> listAll() {
		
		return null;
	}
}