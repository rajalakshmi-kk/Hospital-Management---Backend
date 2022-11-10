package com.example.hospitalproject.hospitalmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="doc_id")
	private String docId;
	
	@Column(name="doc_name")
	private String doctorName;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="deg")
	private String degree;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="ph_no")
	private String contactNumber;

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", doctorName=" + doctorName + ", designation=" + designation + ", degree="
				+ degree + ", emailId=" + emailId + ", contactNumber=" + contactNumber + "]";
	}
	
}
