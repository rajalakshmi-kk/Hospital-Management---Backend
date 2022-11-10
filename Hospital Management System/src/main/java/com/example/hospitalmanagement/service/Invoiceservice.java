package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;
import com.example.hospitalproject.hospitalmanagement.entity.Invoice;

public interface Invoiceservice {
	
									public List<Invoice> findAllInvoice();
									
									public Invoice findByInvoiceId(String invoiceId) throws Exception;	
								
									public String deleteInvoice(String invoiceId);
									
									Invoice save(Invoice invoice);

}
