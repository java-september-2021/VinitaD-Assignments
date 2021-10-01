package com.vinita.dojoandninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinita.dojoandninja.models.Dojo;
import com.vinita.dojoandninja.repositories.DojoRepository;



@Service
public class DojoService {
	private DojoRepository dRepo;

	public DojoService(DojoRepository dRepo) {
		this.dRepo = dRepo;
	}
	
	//return all dojo
	public List<Dojo> allDojo(){
		return this.dRepo.findAll();
	}
	
	//create a dojo
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//retrieve a dojo
	public Dojo getDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	//update a dojo
	public Dojo updateDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//delete a dojo
	public void destroy(Long id) {
		this.dRepo.deleteById(id);
	}
}
		
