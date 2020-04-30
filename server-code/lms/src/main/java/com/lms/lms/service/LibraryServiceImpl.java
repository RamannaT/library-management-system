package com.lms.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.lms.dao.LibraryRepositoryImpl;
import com.lms.lms.library.model.Library;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	LibraryRepositoryImpl libraryRepository;
	
	public LibraryServiceImpl(){}

	@Override
	public void insertLibrary(Library library) {
		libraryRepository.insertLibrary(library);
	}

	@Override
	public Library updateLibrary(Library library, Long id) {
		return libraryRepository.updateLibrary(library, id);
	}

	@Override
	public Library getById(Long id) {
		return libraryRepository.getById(id);
	}

	@Override
	public List<Library> getAll() {
		return libraryRepository.getAllLibrary();
	}

}
