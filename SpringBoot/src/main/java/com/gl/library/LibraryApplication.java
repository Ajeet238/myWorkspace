package com.gl.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.library.model.College;
import com.gl.library.model.GreatLearning;
import com.gl.library.serviceImpl.LibraryServiceImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j // log.info
public class LibraryApplication implements CommandLineRunner{

	@Autowired
	LibraryServiceImpl libraryServiceImpl;
	public static void main(String[] args) {
		
		SpringApplication.run(LibraryApplication.class, args);
		System.out.println("Hello Ajeet");
		System.out.println("Hello Dev-tools");
	}
// this will run before main method
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//GreatLearning gl2 = new GreatLearning("Cunstructor injection", "Ajeet");
	/*
	 * to use default cunstructor remove parameterised 
	 */
	
		GreatLearning gl = new GreatLearning();
		gl.setCourse("Backend Development");
		gl.setTeacher("Ajeet");
		
		System.out.println(gl.getCourse());
		System.out.println(gl);
//		System.out.println(gl2);
		
		GreatLearning gl3 = GreatLearning.builder().course("Learning Builder").teacher("taught by Vijay").build();
		System.out.println(gl3);
		
		GreatLearning gl4 = GreatLearning.builder().course("Learning Spring Boot").teacher("taught by Vijay patidar")
				.college(College.builder().college("Gl").build()).build();
		
		System.out.println(gl4);
		
		log.info("fetch all: -> {}", libraryServiceImpl.getAllLibrary() );
	}

}
