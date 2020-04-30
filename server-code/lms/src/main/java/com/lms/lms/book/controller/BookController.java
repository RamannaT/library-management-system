package com.lms.lms.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.lms.book.model.Book;

@RestController
public class BookController {
	
	
	@PostMapping(path="/book/create")
	public void createBook(@RequestBody Book book) {
		
	}
	
	@PutMapping(path="/book/update/bookId/{bookId}")
	public void updateBook(@RequestBody Book book,long bookId) {
		
		
	}
	
	
	@GetMapping(path="/book/getAll")
	public List<Book> getAll(){
		
		List<Book> listOfBooks = new ArrayList<Book>();
		
		return listOfBooks;
	}
	
	@GetMapping(path="/book/bookId/{bookId}")
	public Book getBookById() {		
		Book book = new Book();
		return book;
	}
	

}
