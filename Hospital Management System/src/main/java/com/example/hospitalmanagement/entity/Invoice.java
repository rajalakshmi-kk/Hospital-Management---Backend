package com.example.hospitalproject.hospitalmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="invoice")
@DynamicUpdate
public class Invoice {

	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="invoice_Id")
	private String invoiceId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="token_num")
	private Integer tokenNum;
	
	@Column(name="bill_amt")
	private Long billAmount;
	
	@OneToOne
	private Patient patient;
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
	
	
	public Invoice(String invoiceId, String patientName, Integer tokenNum, Long billAmount, Patient patient) {
		super();
		this.invoiceId = invoiceId;
		this.patientName = patientName;
		this.tokenNum = tokenNum;
		this.billAmount = billAmount;
		this.patient = patient;
	}

	public Invoice() {
		super();
	}

	

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getTokenNum() {
		return tokenNum;
	}

	public void setTokenNum(Integer tokenNum) {
		this.tokenNum = tokenNum;
	}

	public Long getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Long billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", patientName=" + patientName + ", tokenNum=" + tokenNum
				+ ", billAmount=" + billAmount + ", patient=" + patient + "]";
	}

	
}
