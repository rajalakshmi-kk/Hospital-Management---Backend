package com.example.hospitalproject.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalproject.hospitalmanagement.dao.ReceptionistRepository;
import com.example.hospitalproject.hospitalmanagement.entity.Receptionist;

@Service
public class ReceptionistServiceimpl implements ReceptionistService{

	@Autowired
	ReceptionistRepository receptionistRepo;
	
	public ReceptionistServiceimpl(ReceptionistRepository receptionistRepo) {
		super();
		this.receptionistRepo=receptionistRepo;
	}

	@Override
	public Receptionist findReceptionistByRId(Integer rId) throws Exception {
		Optional<Receptionist> result = receptionistRepo.findById(rId);
		
		Receptionist thereceptionist = null;
		if(result.isPresent())
		{
			thereceptionist = result.get();
		}
		else {
			throw new Exception("receptionist id not found : "+rId);
		}
		return thereceptionist;
	}

	@Override
	public List<Receptionist> findAllReceptionist() {
		return receptionistRepo.findAll();
	}

	@Override
	public Receptionist update(Receptionist receptionist) {
		Receptionist receptionists = receptionistRepo.save(receptionist);
		return receptionists;
	}

	@Override
	public Receptionist save(Receptionist receptionist) {
		return receptionistRepo.save(receptionist);
	}

	@Override
	public String deleteReceptionistByRId(Integer rId) throws Exception {
		Receptionist receptionist = findReceptionistByRId(rId);
		
		if(receptionist==null)
		{
			throw new Exception("receptionist id not found : "+rId);
		}
		receptionistRepo.deleteById(rId);
		
		return "Deleted receptionist id : "+rId;
	}

	
	
}
