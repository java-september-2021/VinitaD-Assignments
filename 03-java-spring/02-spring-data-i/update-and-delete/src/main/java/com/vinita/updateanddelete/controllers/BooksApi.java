package com.vinita.updateanddelete.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinita.updateanddelete.models.Book;
import com.vinita.updateanddelete.services.BookService;

@RestController
public class BooksApi {
	private BookService service;

	public BooksApi(BookService service) {
		super();
		this.service = service;
	}
	@GetMapping("/api/books")
	public List<Book> index() {
		return this.service.allBooks();
	}
	
	@PostMapping("/api/books")
	public Book createBook(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="numberOfPages") Integer numOfPages) {
		Book newBook = new Book(title, desc, lang, numOfPages); 
		return this.service.createBook(newBook);
	}
	
	@GetMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		return this.service.findBook(id);
	}
	
	@PutMapping("/api/books/{id}") //how to update a book if that does not exist and this code is creating a new book
	public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="numberOfPages") Integer numOfPages) {
		Book book = this.service.findBook(id);
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lang);
		book.setNumberOfPages(numOfPages);
		// =new Book(title, desc, lang, numOfPages); 
		return this.service.update(book);
	}
	
	@DeleteMapping("/api/books/{id}")  //how to stop an error if we are requesting to delete a book that does not exist
	public void deleteBook(@PathVariable("id") Long id) {
		this.service.deleteById(id);
	}
}
		
		
