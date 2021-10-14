package com.vinita.overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.overflow.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	
}
