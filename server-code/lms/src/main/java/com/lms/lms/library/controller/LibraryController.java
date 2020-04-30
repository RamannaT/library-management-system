package com.lms.lms.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

	@GetMapping(path = "/library/allBooks")
	public String getAllBooks() {
		
		return "All Books";
	}
	
	
}
