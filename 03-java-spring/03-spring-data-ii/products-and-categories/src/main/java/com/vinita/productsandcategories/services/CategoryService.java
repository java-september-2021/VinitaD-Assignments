package com.vinita.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.productsandcategories.models.Category;
import com.vinita.productsandcategories.models.Product;
import com.vinita.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	
	
	//create
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	//get one Category
	public Category getCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	//delete one Category
	public void deleteCategory(Long id) {
		this.cRepo.deleteById(id);
	}
	
	//update a Category
	public Category updateCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	//get all Category
	public List<Category> getAllCategory(){
		return this.cRepo.findAll();
	}
	//find category that are not in specific product
	public List<Category> getCategoryNotInProduct(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}
	//add product to category and save the category
	public void addProductToCategory(Category category, Product product) {
		category.getProducts().add(product);
		this.cRepo.save(category);
	}
}
