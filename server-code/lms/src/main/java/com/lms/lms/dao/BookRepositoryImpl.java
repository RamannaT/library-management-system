package com.lms.lms.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.lms.lms.library.model.Book;

@Repository
@Transactional
public class BookRepositoryImpl {

	@Autowired
	@Lazy
	BookRepository bookRepository;

	public BookRepositoryImpl() {
	}

	public void insertBook(Book book) {
		bookRepository.save(book);
	}

	public Book updateBook(Book book, long id) {		
		Book updateBook = getBookById(id);
		updateBook.setTitle(book.getTitle());
		updateBook.setISBN(book.getISBN());
		updateBook.setSubject(book.getSubject()); 
		updateBook.setPublisher(book.getPublisher());
		bookRepository.save(updateBook);
		return updateBook;
	}

	public Book getBookById(Long id) {
		Book book = bookRepository.findById(id).get();
		return book;
	}

	public List<Book> getAllBooks() {
		List<Book> books = bookRepository.findAll();		
		return books;
	}
}
