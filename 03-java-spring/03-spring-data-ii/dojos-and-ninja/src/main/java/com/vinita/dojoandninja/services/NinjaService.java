package com.vinita.dojoandninja.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.vinita.dojoandninja.models.Ninja;

import com.vinita.dojoandninja.repositories.NinjaRepository;



@Service
public class NinjaService {
	
	private NinjaRepository nRepo;

	public NinjaService(NinjaRepository nRepo) {
		this.nRepo = nRepo;
	}
	
	//return all ninja
	public List<Ninja> allNinja(){
		return this.nRepo.findAll();
	}
	
	//create a ninja
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//retrieve a ninja
	public Ninja getNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	//update a ninja
	public Ninja updateNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//delete a ninja
	public void destroy(Long id) {
		this.nRepo.deleteById(id);
	}
}
		
