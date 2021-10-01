package com.vinita.studentroster1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.studentroster1.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> findAll();
	
}
