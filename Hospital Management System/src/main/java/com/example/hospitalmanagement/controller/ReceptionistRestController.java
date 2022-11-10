package com.example.hospitalproject.hospitalmanagement.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.hospitalproject.hospitalmanagement.entity.Invoice;
import com.example.hospitalproject.hospitalmanagement.entity.Receptionist;
import com.example.hospitalproject.hospitalmanagement.service.ReceptionistService;



@Controller
@RequestMapping("/receptionist")
public class ReceptionistRestController {
		@Autowired
		private ReceptionistService receptionistService;
		
		
		
		public ReceptionistRestController(ReceptionistService receptionistService) {
			super();
			this.receptionistService = receptionistService;
		}








		@GetMapping("/show-receptionist")
		public List<Receptionist> showReceptionists() {
			return receptionistService.findAllReceptionist();
		}
		
		
		
		
		
		

		
		@RequestMapping("/createInvoice")
		public String createInvoice(Model model) {
			Invoice i = new Invoice();
			model.addAttribute("invoice",i);
			return "invoice";
		}
		
		
		
	
}
