package com.vinita.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.productsandcategories.models.Category;
import com.vinita.productsandcategories.models.Product;
import com.vinita.productsandcategories.models.User;
import com.vinita.productsandcategories.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	
	//create
	public User createProduct(User user) {
		return this.uRepo.save(user);
	}
	//get one product
	public User getUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	//delete one product
	public void deleteProduct(Long id) {
		this.uRepo.deleteById(id);
	}
	
	//update a product 
	public User updateProduct(User user) {
		return this.uRepo.save(user);
	}
	
	//get all product
	public List<User> getAllUser(){
		return this.uRepo.findAll();
	}
	
	

}
