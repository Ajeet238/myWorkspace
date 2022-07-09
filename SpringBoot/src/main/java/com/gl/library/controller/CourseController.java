package com.gl.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.library.model.GreatLearning;
import com.gl.library.service.CourseService;

//@Controller
// @Controller needs also @ResponseBody annotation
@RestController
public class CourseController {
	@Autowired
	CourseService service;
	
	@GetMapping("/info") // get request
	//@ResponseBody
	public GreatLearning info() {
		return service.get();
	}
	
	@PostMapping("customInfo") // post request
	public String customInfo(String course, String teacher) {
		return service.customInfo(course, teacher);
	}
	
}
