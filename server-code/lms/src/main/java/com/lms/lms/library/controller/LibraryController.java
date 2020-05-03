package com.lms.lms.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.lms.library.model.Library;
import com.lms.lms.service.LibraryServiceImpl;

@RestController
public class LibraryController {

	@Autowired(required = true)
	LibraryServiceImpl libraryService;
	
	public LibraryController() {}

	@PostMapping("/library/create")
	public void insertLibrary(@RequestBody Library library) {
		libraryService.insertLibrary(library);
	}

	@PutMapping("/library/update/libraryId/{libraryId}")
	public Library updateibrary(@RequestBody Library library, @PathVariable Long libraryId) {
		Library updatedLibrary = libraryService.updateLibrary(library, libraryId);
		return updatedLibrary;
	}

	@GetMapping("/library/libraryId/{libraryId}")
	public Library getById(@PathVariable Long libraryId) {
		Library library = libraryService.getById(libraryId);
		return library;
	}

	@GetMapping("/library/getAll") 
	public List<Library> getAll() {
		List<Library> libraryList = libraryService.getAll();
		return libraryList;
	}
	 

}
