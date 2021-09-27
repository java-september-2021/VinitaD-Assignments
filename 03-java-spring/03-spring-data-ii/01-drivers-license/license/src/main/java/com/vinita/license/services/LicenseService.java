package com.vinita.license.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.license.models.License;
import com.vinita.license.repositories.LicenseReository;


@Service
public class LicenseService {
	@Autowired
	private LicenseReository lRepo;

//	public LicenseService(LicenseReository lRepo) {
//		
//		this.lRepo = lRepo;
//	}
	
	//return all license
	public List<License> allLicense(){
		return this.lRepo.findAll();
	}
	
	//create a license
	public License createLicense(License l) {
		l.setNumber(this.generate());
		return this.lRepo.save(l);
	}
	public int generate() {
		License previousLicense = this.lRepo.findTop1ByOrderByNumberDesc();
		if(previousLicense == null) {
			return 1;
		}
		int largestNumber =previousLicense.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	
	//retrieve a license
	public License getLicense(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	//update a license
	public License updateLicense(License l) {
		return this.lRepo.save(l);
	}
	
	//delete a license
	public void destroy(Long id) {
		this.lRepo.deleteById(id);
	}
}
