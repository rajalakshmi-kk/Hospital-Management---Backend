package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalproject.hospitalmanagement.dao.DoctorRepository;
import com.example.hospitalproject.hospitalmanagement.entity.Doctor;


@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctorRepository doctorRepo;
	
	public DoctorServiceImpl(DoctorRepository doctorRepo) {
		super();
		this.doctorRepo=doctorRepo;
	}

	@Override
	public List<Doctor> findAllDoctor() {
		return doctorRepo.findAll();
	}

	@Override
	public Doctor findByDoctorName(String doctorName) throws Exception {
		Doctor doctor = doctorRepo.findByDoctorName(doctorName);
		if (doctor == null) {
			throw new Exception("Doctor not found !!!");
		}
		return doctor;
	}

	@Override
	public Doctor update(Doctor doctor) {
		Doctor doctors = doctorRepo.save(doctor);
		return doctors;
	}

	@Override
	public void save(Doctor doctor) {
		doctorRepo.save(doctor);
	}



	@Override
	public String deleteByDocId(String docId) throws Exception {
		Doctor doctor = findByDocId(docId);
		
		if(doctor==null)
		{
			throw new Exception("doctor id not found : "+docId);
		}
		doctorRepo.deleteById(docId);
		
		return "Deleted doctor id : "+docId;
	
	}

	@Override
	public Doctor findByDocId(String docId) throws Exception {
		Optional<Doctor> result = doctorRepo.findByDocId(docId);
		
		Doctor theDoctor=null;
		if(result.isPresent())
		{
			theDoctor = result.get();
		}
		else {
			throw new Exception("doctor id not found : "+docId);
		}
		return theDoctor;
	}

}
