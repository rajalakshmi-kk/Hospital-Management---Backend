package com.example.hospitalproject.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospitalproject.hospitalmanagement.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin, String>{
	
	
	
	public String findByAdminNameAndPassword(String adminName , String password);
	public String findPasswordByAdminName(String adminName);
}
