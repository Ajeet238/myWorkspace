package com.gl.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.library.entity.Library;
import com.gl.library.repository.LibraryRepository;

@Service
public class LibraryServiceImpl {
	@Autowired
	LibraryRepository readRepository;
	public List<Library> getAllLibrary(){
		return readRepository.findAll();
	}
}
