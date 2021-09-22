package com.vinita.updateanddelete.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.vinita.updateanddelete.models.Book;
import com.vinita.updateanddelete.services.BookService;


@Controller
public class BooksController {
	private BookService bService;

	public BooksController(BookService bService) {
	
		this.bService = bService;
	}
	
	@GetMapping("/books")
    public String index(Model model) {
        List<Book> books = bService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
	
	@GetMapping("/books/new")
    public String newBook( @ModelAttribute("book") Book book) {
        return "new.jsp";
    }
	
	@PostMapping("/books")
	public String createBook1(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
            return "new.jsp";
        } 
		Book newbook = bService.createBook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model) {
		Book targetBook =  this.bService.findBook(id);
		System.out.println(targetBook);
		System.out.println(targetBook.getTitle());
		
		model.addAttribute("book", targetBook);
		return "show.jsp";
	}
	
	@GetMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id,Model model,@ModelAttribute("book") Book book) {
		Book targetbook = this.bService.findBook(id);
		model.addAttribute("book",targetbook);
		return "edit.jsp";
	}
	
	@PutMapping("/books/{id}")
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		} else {
			bService.update(book);
			return "redirect:/books";
		}
		
	}
	@DeleteMapping("/books/{id}")
	public String destroy(@PathVariable("id") Long id) {
		bService.deleteById(id);
		return "redirect:/books";
	}
	
		

}
