package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalproject.hospitalmanagement.dao.InvoiceRepository;
import com.example.hospitalproject.hospitalmanagement.entity.Invoice;


@Service
public class InvoiceServiceImpl implements Invoiceservice{

	@Autowired
	InvoiceRepository invoiceRepo;
	
	
	public InvoiceServiceImpl(InvoiceRepository invoiceRepo) {
		super();
		this.invoiceRepo=invoiceRepo;
	}

					@Override
					public List<Invoice> findAllInvoice() {
						return invoiceRepo.findAll();
					}
				
					@Override
					public Invoice findByInvoiceId(String invoiceId) throws Exception {
						
						Optional<Invoice> result = invoiceRepo.findByInvoiceId(invoiceId);
						
						Invoice theInvoice=null;
						if(result.isPresent())
						{
							theInvoice = result.get();
						}
						else {
							throw new Exception("invoice id not found : "+invoiceId);
						}
						return theInvoice;
					 }
				
					 @Override
				   	 public Invoice save(Invoice invoice) {
							return invoiceRepo.save(invoice);
				 	 }

					@Override
					public String deleteInvoice(String invoiceId) {
						return invoiceRepo.deleteByInvoiceId(invoiceId);						
					}

}
