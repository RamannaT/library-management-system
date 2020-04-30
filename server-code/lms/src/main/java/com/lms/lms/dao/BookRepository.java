package com.lms.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.lms.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
