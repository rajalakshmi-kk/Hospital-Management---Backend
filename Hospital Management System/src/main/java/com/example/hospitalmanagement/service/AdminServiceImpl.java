package com.example.hospitalproject.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalproject.hospitalmanagement.dao.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepo;
	
	public AdminServiceImpl(AdminRepository adminRepo) {
		super();
		this.adminRepo=adminRepo;
	}

	@Override
	public String findByAdminNameandPassword(String adminName , String password) throws Exception {
		String admin = adminRepo.findByAdminNameAndPassword(adminName, password);
		String adminPassword = adminRepo.findPasswordByAdminName(adminName);
		if (admin == null) {
			throw new Exception("admin not found !!!");
		}
		else if(!password.equals(adminPassword)) {
			throw new Exception("admin or password is wrong !!!");
		}
	
		return "login successfull";
	}

}
