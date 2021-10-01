package com.vinita.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.productsandcategories.models.Product;
import com.vinita.productsandcategories.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findAll();

}
