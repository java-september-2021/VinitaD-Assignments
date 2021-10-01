package com.vinita.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.productsandcategories.models.Category;
import com.vinita.productsandcategories.models.Product;
import com.vinita.productsandcategories.models.User;
import com.vinita.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	
	//create
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	//get one product
	public Product getProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	//delete one product
	public void deleteProduct(Long id) {
		this.pRepo.deleteById(id);
	}
	
	//update a product 
	public Product updateProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	//get all product
	public List<Product> getAllProduct(){
		return this.pRepo.findAll();
	}
	
	//find product that are not in specific category
		public List<Product> getProductNotInCategory(Category category){
			return this.pRepo.findByCategoriesNotContains(category);
		}
		
	//setting many to many
	public void addCategoryToProduct(Category category, Product product) {
		product.getCategories().add(category);
		this.pRepo.save(product);
	}
		// adding likes to product from user
	public void userLikesProduct(User user, Product product) {
		product.getUserLiked().add(user);
		this.pRepo.save(product);
	}
	//removing likes from product
	public void userDisLikesProduct(User user, Product product) {
		product.getUserLiked().remove(user);
		this.pRepo.save(product);
	}
}
