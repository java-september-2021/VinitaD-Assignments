package com.vinita.license.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.license.models.Person;


@Repository
public interface PersonReository  extends CrudRepository<Person, Long> {
	List<Person> findAll();
	List<Person> findByLicenseIsNull();
}
