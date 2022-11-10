package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;

import com.example.hospitalproject.hospitalmanagement.entity.Receptionist;

public interface ReceptionistService {
	
										public Receptionist findReceptionistByRId(Integer rId) throws Exception;
										
										public Receptionist update(Receptionist receptionist);
										
										public Receptionist save(Receptionist receptioist);
										
										public String deleteReceptionistByRId(Integer rId) throws Exception;

										List<Receptionist> findAllReceptionist();
										
								
}
