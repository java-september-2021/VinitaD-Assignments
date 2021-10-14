package com.vinita.overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vinita.overflow.models.Question;



public interface QuestionRepository extends CrudRepository<Question, Long> {
	List<Question> findAll();
	
}
