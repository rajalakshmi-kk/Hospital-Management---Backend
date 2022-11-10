package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;

import com.example.hospitalproject.hospitalmanagement.entity.Doctor;

public interface DoctorService {

							public Doctor findByDocId(String docId) throws Exception;
							
							public List<Doctor> findAllDoctor();
							
							public Doctor findByDoctorName(String doctorName) throws Exception;
							
							public Doctor update(Doctor doctor);
							
							public void save(Doctor doctor);
							
							public String deleteByDocId(String docId) throws Exception;

}
