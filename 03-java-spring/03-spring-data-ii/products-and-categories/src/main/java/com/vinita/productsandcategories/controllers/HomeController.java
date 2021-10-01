package com.vinita.productsandcategories.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vinita.productsandcategories.models.Category;
import com.vinita.productsandcategories.models.Product;
import com.vinita.productsandcategories.models.User;
import com.vinita.productsandcategories.services.CategoryService;
import com.vinita.productsandcategories.services.ProductService;
import com.vinita.productsandcategories.services.UserService;

@Controller
public class HomeController {
	@Autowired
	public ProductService pService;
	@Autowired
	public CategoryService cService;
	@Autowired
	public UserService uService;
	
	
	//go to root route
	@GetMapping("/")
	public String getUser(Model myModel,@ModelAttribute("user") User user) {
		myModel.addAttribute("allUser", this.uService.getAllUser());
		System.out.println(this.uService.getAllUser());
		return "user.jsp";
	}
	@PostMapping("/user/new")
    public String createUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "user.jsp";
        } else {
            this.uService.createProduct(user);
            return "redirect:/";
        }
     
    }
	
	//tologin and logout
	@PostMapping("/login")
	public String userToLogin(@RequestParam("userToLog") Long id, HttpSession session) {
		session.setAttribute("user__id", id); //setting id to session 
		return "redirect:/product/new";
	}
	//tologout
	@GetMapping("/logout")
	public String logoutUser(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
	//for likes
	@GetMapping("/like/{id}")
	public String userToLike(@PathVariable("id") Long id, HttpSession session) {
		User targetUser= this.uService.getUser((Long)session.getAttribute("user__id"));
		Product targetProduct = this.pService.getProduct(id);
		this.pService.userLikesProduct(targetUser, targetProduct);
		return "redirect:/product/new";
	}
	
	//for dislikes
	@GetMapping("/dislike/{id}")
	public String userToDisLike(@PathVariable("id") Long id, HttpSession session) {
		User targetUser= this.uService.getUser((Long)session.getAttribute("user__id"));
		Product targetProduct = this.pService.getProduct(id);
		this.pService.userDisLikesProduct(targetUser, targetProduct);
		return "redirect:/product/new";
	}
	
	//for product
	@GetMapping("/product/new")
	public String newproduct(@ModelAttribute("product") Product product, Model myModel, HttpSession session) {
		if(session.getAttribute("user__id") == null) {
			return "redirect:/";
		}
		
		
		myModel.addAttribute("user",this.uService.getUser((Long)session.getAttribute("user__id")));
		myModel.addAttribute("allProduct", this.pService.getAllProduct());
		return "/product/new.jsp";
	}
	@PostMapping("/product/new")
    public String create(@Valid @ModelAttribute("product") Product product, BindingResult result) {
        if (result.hasErrors()) {
            return "/product/new.jsp";
        } else {
            this.pService.createProduct(product);
            return "redirect:/product/new";
        }
     
    }
	@GetMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model myModel) {
		myModel.addAttribute("product",this.pService.getProduct(id));
		System.out.println(this.pService.getProduct(id));
		List<Category> notInCategory = this.cService.getCategoryNotInProduct(this.pService.getProduct(id));
		myModel.addAttribute("notInCategory",notInCategory);
		return "/product/show.jsp";
	}
	//trying to do many to many
	//i will need to grab product from path variable
	//I will need to grab list of category of that produuct(product.getCategory())
	//I will have to get newCategory from request param and add to the existing list(by .add(newCategory)
	//do I have to save? before redirecting
	
	@PostMapping("/prodCat/{id}")
	public String addCategogoryToProduct(@RequestParam("category") Long id, @PathVariable("id") Long productId) {
		Product targetProduct = this.pService.getProduct(productId);
		Category targetCategory = this.cService.getCategory(id);
		this.pService.addCategoryToProduct(targetCategory, targetProduct);
		return "redirect:/product/new";
	}
		
		
	
	
	//for catogory
	@GetMapping("/category/new")
	public String newCategory(@ModelAttribute("category") Category category, Model myModel) {
		myModel.addAttribute("allCategory", this.cService.getAllCategory());
		return "/category/new.jsp";
	}
	@PostMapping("/category/new")
    public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "/category/new.jsp";
        } else {
            this.cService.createCategory(category);
            return "redirect:/category/new";
        }
	}
	@GetMapping("/category/{id}")
	public String showCategory(@PathVariable("id") Long id, Model myModel) {
		myModel.addAttribute("category",this.cService.getCategory(id));
		System.out.println(this.cService.getCategory(id));
		List<Product> notInProduct = this.pService.getProductNotInCategory(this.cService.getCategory(id));
		myModel.addAttribute("notInProduct",notInProduct);
		return "/category/show.jsp";
	}
	@PostMapping("/catProduct/{id}")
	public String addProductinCategory(@RequestParam("product") Long id, @PathVariable("id") Long categoryId) {
		Product targetProduct = this.pService.getProduct(id);
		Category targetCategory = this.cService.getCategory(categoryId);
		this.cService.addProductToCategory(targetCategory, targetProduct);
		return "redirect:/category/" + categoryId;
	}
}
