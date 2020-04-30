package com.lms.lms.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.lms.library.model.Library;
import com.lms.lms.service.LibraryServiceImpl;

@RestController
public class LibraryController {

	@Autowired(required = true)
	LibraryServiceImpl libraryService;

	public void insertLibrary(@RequestBody Library library) {
		libraryService.insertLibrary(library);
	}

	public Library updateibrary(@RequestBody Library library, @PathVariable Long id) {
		Library updatedLibrary = libraryService.updateLibrary(library, id);
		return updatedLibrary;
	}

	public Library getById(@PathVariable Long id) {
		Library library = libraryService.getById(id);
		return library;
	}

	public List<Library> getAll() {
		List<Library> libraryList = libraryService.getAll();
		return libraryList;
	}

}
