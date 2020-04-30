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
		System.out.println("start BookController : /book/create " + book);
		bookService.insertBook(book);
		System.out.println("end BookController : /book/create");
	}

	@PutMapping(path = "/book/update/bookId/{bookId}")
	public Book updateBook(@RequestBody Book book, @PathVariable Long bookId) {
		System.out.println("start BookController : /book/update/bookId/{bookId} " + book + "ID :" + bookId);
		Book updateBook = bookService.updateBook(book, bookId);
		System.out.println(
				"start BookController : /book/update/bookId/{bookId} " + updateBook + "ID :" + updateBook.getId());
		return updateBook;
	}

	@GetMapping(path = "/book/getAll")
	public List<Book> getAll() {
		System.out.println("inside BookController : /book/getAll");
		List<Book> listOfBooks = bookService.getAllBooks();
		System.out.println("inside BookController : /book/getAll   " + listOfBooks);
		return listOfBooks;
	}

	@GetMapping(path = "/book/bookId/{bookId}")
	public Book getBookById(@PathVariable Long bookId) {
		System.out.println("inside BookController : /book/bookId/{bookId}");
		Book book = bookService.getBookById(bookId);
		System.out.println("inside BookController : /book/bookId/{bookId}  " + book);
		return book;
	}

}
