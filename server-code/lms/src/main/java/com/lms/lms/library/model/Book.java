package com.lms.lms.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK1")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String ISBN;
	private String title;
	private String subject;
	private String publisher; 
	public Book() {
	}

	public Book(String iSBN, String title, String subject, String publisher) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.subject = subject;
		this.publisher = publisher;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	} 
	@Override
	public String toString() {
		return "Book [id=" + id + ", ISBN=" + ISBN + ", "
				+ "title=" + title + ", subject=" + subject + ", "
				+ "publisher=" + publisher + "" + "]";
	}

}
