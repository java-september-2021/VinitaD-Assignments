package com.vinita.overflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.overflow.models.Question;
import com.vinita.overflow.models.Tag;
import com.vinita.overflow.repositories.QuestionRepository;
import com.vinita.overflow.repositories.TagRepository;



@Service
public class QuestionService {
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;
	
	
	//create
	public Question createQuestion( Question question) {
		question.setAllTag(this.splitString(question.getTagFromForm()));
		return this.qRepo.save(question);
	}
	//get one product
	public  Question getQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	//delete one product
	public void deleteQuestion(Long id) {
		this.qRepo.deleteById(id);
	}
	
	//update a product 
	public  Question updateProduct( Question tag) {
		return this.qRepo.save(tag);
	}
	
	//get all product
	public List<Question> getAllQuestion(){
		return this.qRepo.findAll();
	}
	
	public Tag getTagBYSubject(String subject) {
		Tag target = this.tRepo.findBySubject(subject);
		return target;
	}
	
	public List<Tag> splitString(String subject) {
		String[] alltag = subject.split(",");   //getting string from from end and spliting it
		List<Tag> newList = new ArrayList<Tag>();   // making a new arraylist to add stuff to it
		for (String s : alltag) { 
			s.trim();
		    if(this.tRepo.existsBySubject(s)) {    // check if it exists
		    	Tag target = this.getTagBYSubject(s);   // if it is there get tag object
		    	newList.add(target);                     // add it to newlist
		    } else {
		    	Tag newTag = new Tag();            // if not create a new tag
		    	newTag.setSubject(s);   
		    	this.tRepo.save(newTag); // add subject to new constructor
		    	Tag target = this.getTagBYSubject(s);  
		    	newList.add(target);
		    }
		    
		}
		return newList;
	}
	
}
