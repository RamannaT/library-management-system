package com.lms.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.lms.dao.BookRepositoryImpl;
import com.lms.lms.library.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepositoryImpl bookRepository;

	public BookServiceImpl() {
	}

	@Override
	public void insertBook(Book book) {
		bookRepository.insertBook(book);
	}

	@Override
	public Book updateBook(Book book,long id) {
		return bookRepository.updateBook(book, id);
	}

	@Override
	public Book getBookById(Long id) {
		return bookRepository.getBookById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.getAllBooks();
	}

}
