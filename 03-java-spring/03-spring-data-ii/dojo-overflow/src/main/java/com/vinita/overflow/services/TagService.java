package com.vinita.overflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.overflow.models.Tag;
import com.vinita.overflow.repositories.TagRepository;



@Service
public class TagService {
	@Autowired
	private TagRepository tRepo;
	
	
	//create
	public Tag createTag(Tag tag) {
		return this.tRepo.save(tag);
	}
	//get one product
	public Tag getTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	//delete one product
	public void deleteTag(Long id) {
		this.tRepo.deleteById(id);
	}
	
	//update a product 
	public Tag updateProduct(Tag tag) {
		return this.tRepo.save(tag);
	}
	
	//get all product
	public List<Tag> getAllTag(){
		return this.tRepo.findAll();
	}
	
}
