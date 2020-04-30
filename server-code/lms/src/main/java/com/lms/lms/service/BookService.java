package com.lms.lms.service;

import java.util.List;

import com.lms.lms.library.model.Book;

public interface BookService {
	public void insertBook(Book book);

	public Book updateBook(Book book, long id);

	public Book getBookById(Long id);

	public List<Book> getAllBooks();
}
