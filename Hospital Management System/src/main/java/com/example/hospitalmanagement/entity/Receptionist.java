package com.example.hospitalproject.hospitalmanagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="receptionist")
public class Receptionist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="r_id")
	private String rId;
	
	@Column(name="receptionist_name")
	private String receptionistName;
	
	@Column(name="phn_num")
	private String phoneNumber;
	
	@Column(name="emai_id")
	private String emailId;
	
	@OneToMany
	private List<Appointment> appointment = new ArrayList<>(); 
	
	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Receptionist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receptionist(String rId, String receptionistName, String phoneNumber, String emailId,
			List<Appointment> appointment) {
		super();
		this.rId = rId;
		this.receptionistName = receptionistName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.appointment = appointment;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public String getReceptionistName() {
		return receptionistName;
	}

	public void setReceptionistName(String receptionistName) {
		this.receptionistName = receptionistName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Receptionist [rId=" + rId + ", receptionistName=" + receptionistName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + "]";
	}
	
}
