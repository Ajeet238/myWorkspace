package com.gl.library.service;

import java.lang.annotation.Annotation;

import org.springframework.stereotype.Service;

import com.gl.library.model.GreatLearning;

@Service
public class ServiceImpl implements CourseService {
	@Override
	public GreatLearning get() {
		// TODO Auto-generated method stub
		GreatLearning gl = new GreatLearning();
		gl.setCourse("Controller");
		gl.setTeacher("Ajeet");
		
		return gl;
	}
	@Override
	public String customInfo(String course, String teacher) {
		// TODO Auto-generated method stub
		GreatLearning gl = new GreatLearning();
		gl.setCourse(course);
		gl.setTeacher(teacher);
		return "Course is: "+ gl.getCourse() +" and taught by: "+ gl.getTeacher();
	}

}
