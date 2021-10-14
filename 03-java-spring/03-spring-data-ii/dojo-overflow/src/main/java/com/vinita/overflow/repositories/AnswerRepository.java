package com.vinita.overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.overflow.models.Answer;


@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
	List<Answer> findAll();
	
}
