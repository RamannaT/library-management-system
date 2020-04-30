package com.lms.lms.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.lms.lms.library.model.Library;

@Repository
@Transactional
public class LibraryRepositoryImpl {

	@Autowired
	@Lazy
	LibraryRespository libraryRepository;

	public void insertLibrary(Library library) {
		libraryRepository.save(library);
	}

	public Library updateLibrary(Library library, Long id) {
		Library upsateLibrary = getById(id);
		upsateLibrary.setId(library.getId());
		upsateLibrary.setName(library.getName());
		upsateLibrary.setAddress(library.getAddress());
		Library upsatedLibrary = libraryRepository.save(upsateLibrary);
		return upsatedLibrary;
	}

	public Library getById(Long id) {
		Optional<Library> library = libraryRepository.findById(id);
		return library.get();
	}

	public List<Library> getAllLibrary() {

		List<Library> listOfLibrary = libraryRepository.findAll();
		return listOfLibrary;

	}

}
