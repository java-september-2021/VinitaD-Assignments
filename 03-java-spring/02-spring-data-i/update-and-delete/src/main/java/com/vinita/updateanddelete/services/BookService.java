package com.vinita.updateanddelete.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinita.updateanddelete.models.Book;
import com.vinita.updateanddelete.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bookrepo;  //Dependency injection or private attribute of book repo

	public BookService(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	
	//return all books
	public List<Book> allBooks(){    
		return this.bookrepo.findAll();
	}
	
	//creates a book
	public Book createBook(Book b) {
		return this.bookrepo.save(b);
	}
	
	//retrieve a book
	public Book findBook(Long id) {
		return this.bookrepo.findById(id).orElse(null);
	}
	
	//update a book
	public Book update(Book book) { 
		return this.bookrepo.save(book);
		}
	
	public void deleteById(Long id){
		this.bookrepo.deleteById(id);
		}

}
		
		
