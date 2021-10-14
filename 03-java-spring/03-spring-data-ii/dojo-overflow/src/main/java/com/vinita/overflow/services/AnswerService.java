package com.vinita.overflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.overflow.models.Answer;
import com.vinita.overflow.models.Question;
import com.vinita.overflow.repositories.AnswerRepository;



@Service
public class AnswerService {
	@Autowired
	private AnswerRepository aRepo;
	
	
	//create
	public Answer createAnswer(Answer ans, Question quest) {
		ans.setQuestion(quest);
		return this.aRepo.save(ans);
	}
	//get one product
	public  Answer getQuestion(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	//delete one product
	public void deleteAnswer(Long id) {
		this.aRepo.deleteById(id);
	}
	
	//update a product 
	public  Answer updateAnswer( Answer tag) {
		return this.aRepo.save(tag);
	}
	
	//get all product
	public List<Answer> getAllAnswer(){
		return this.aRepo.findAll();
	}
	
}
