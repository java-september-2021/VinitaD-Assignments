package com.vinita.language.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinita.language.models.Language;
import com.vinita.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;

	public LanguageService(LanguageRepository lRepo) {
		
		this.lRepo = lRepo;
	}
	
	//return all language
	public List<Language> allLang(){
		return this.lRepo.findAll();
	}
	
	//create a language
	public Language createLang(Language l) {
		return this.lRepo.save(l);
	}
	
	//retrieve a language
	public Language getLang(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	//update a language
	public Language updateLang(Language l) {
		return this.lRepo.save(l);
	}
	
	//delete a language
	public void destroy(Long id) {
		this.lRepo.deleteById(id);
	}
}
