package com.lms.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.lms.library.model.Library;

@Repository
public interface LibraryRespository extends JpaRepository<Library, Long> {

}
