package com.example.hospitalproject.hospitalmanagement.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospitalproject.hospitalmanagement.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

			Optional<Invoice> findByInvoiceId(String invoiceId);
	
			public String deleteByInvoiceId(String invoiceId);

}
