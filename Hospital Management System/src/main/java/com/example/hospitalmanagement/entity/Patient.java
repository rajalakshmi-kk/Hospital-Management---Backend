package com.example.hospitalproject.hospitalmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="token_num")
	private int tokenNum;
	
	@Column(name="p_id")
	private String patientId;
	
	@Column(name="patient_name")
    private String patientName;

    @Column(name="phn")
    private String phn;
    
    @Column(name="address")
    private String address;
    
    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTokenNum() {
		return tokenNum;
	}

	public void setTokenNum(int tokenNum) {
		this.tokenNum = tokenNum;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + "]";
	}
    
	
}
