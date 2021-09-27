package com.vinita.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinita.license.models.Person;
import com.vinita.license.repositories.PersonReository;


@Service
public class PersonService {
	private PersonReository pRepo;

	public PersonService(PersonReository pRepo) {
		
		this.pRepo = pRepo;
	}
	
	//return all person
	public List<Person> allPerson(){
		return this.pRepo.findAll();
	}
	//return person with no license
	public List<Person> noLicense(){
		return this.pRepo.findByLicenseIsNull();
	}
	
	//create a language
	public Person createPerson(Person person) {
		return this.pRepo.save(person);
	}
	
	//retrieve a language
	public Person getPerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	//update a language
	public Person updatePerson(Person l) {
		return this.pRepo.save(l);
	}
	
	//delete a language
	public void destroy(Long id) {
		this.pRepo.deleteById(id);
	}
}
