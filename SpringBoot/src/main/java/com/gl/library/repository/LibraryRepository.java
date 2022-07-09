package com.gl.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.library.entity.Library;

@Repository // enable us to perform crud operation

// Long is the data types of id in Library class
public interface LibraryRepository extends JpaRepository<Library, Long> {
	
}
