package com.example.hospitalproject.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hospitalproject.hospitalmanagement.entity.Invoice;
import com.example.hospitalproject.hospitalmanagement.service.Invoiceservice;

@RestController
@RequestMapping("/invoices")
public class InvoiceRestController {
	@Autowired
	private Invoiceservice invoiceServe;

	public InvoiceRestController(Invoiceservice invoiceServe) {
		super();
		this.invoiceServe=invoiceServe;
	}
	
					@GetMapping("/invoices")
					public List<Invoice> findAll(){
						return invoiceServe.findAllInvoice();
					}
					
					//add mapping to retrieve single invoice
					@GetMapping("/invoices/{invoiceId}")
					public Invoice findById(@PathVariable String invoiceId)
					{
						Invoice invoice = null;
						try {
							invoice = invoiceServe.findByInvoiceId(invoiceId);
						} catch (Exception e) {
							e.printStackTrace();
						}
						return invoice;
					}
					
				   //add mapping for POST/invoices - add new invoice
					@PostMapping("/invoices")
					public Invoice addInvoice(@RequestBody Invoice theInvoice)
					{
					Invoice invoice = invoiceServe.save(theInvoice);
						return invoice;
					}
					
					//delete invoice by invoiceId
					@DeleteMapping("/invoices/{invoiceId}")
					public String delInvoice(@PathVariable String invoiceId) {
						return invoiceServe.deleteInvoice(invoiceId);
					}
}
