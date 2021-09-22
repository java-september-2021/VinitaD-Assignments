package com.vinita.language.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.language.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	  // this method retrieves all the languages from the database
    List<Language> findAll();
}
