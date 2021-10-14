package com.vinita.overflow.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.overflow.models.Tag;


@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
	List<Tag> findAll();
	boolean existsBySubject(String subject);
	Tag findBySubject(String subject);
}
