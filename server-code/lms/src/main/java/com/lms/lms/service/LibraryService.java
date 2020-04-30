package com.lms.lms.service;

import java.util.List;

import com.lms.lms.library.model.Library;

public interface LibraryService {

	public void insertLibrary(Library library);

	public Library updateLibrary(Library library, Long id);

	public Library getById(Long id);

	public List<Library> getAll();

}
