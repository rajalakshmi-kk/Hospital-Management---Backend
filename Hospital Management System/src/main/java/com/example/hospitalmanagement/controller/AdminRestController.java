package com.example.hospitalproject.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalproject.hospitalmanagement.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminRestController {
	@Autowired
	private AdminService adminServe;

	public AdminRestController(AdminService adminServe) {
		super();
		this.adminServe = adminServe;
	}
	
	@GetMapping("/{adminName}/{password}")
	public String login(@PathVariable String adminName, @PathVariable String password) throws Exception {
		String msg = adminServe.findByAdminNameandPassword(adminName, password);
		return msg;
	}
}
