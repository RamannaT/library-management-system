package com.lms.lms.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.lms.library.model.Book;
import com.lms.lms.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping(path = "/book/create")
	public void createBook(@RequestBody Book book) {
		bookService.insertBook(book);
	}

	@PutMapping(path = "/book/update/bookId/{bookId}")
	public Book updateBook(@RequestBody Book book, @PathVariable Long bookId) {
		Book updateBook = bookService.updateBook(book, bookId);
		return updateBook;
	}

	@GetMapping(path = "/book/getAll")
	public List<Book> getAll() {
		List<Book> listOfBooks = bookService.getAllBooks();
		return listOfBooks;
	}

	@GetMapping(path = "/book/bookId/{bookId}")
	public Book getBookById(@PathVariable Long bookId) {
		Book book = bookService.getBookById(bookId);
		return book;
	}

	@GetMapping(path = "/hello-world/{name}")
	public String helloWorld(@PathVariable String name) {
		return "Hello World " + name;

	}
}
