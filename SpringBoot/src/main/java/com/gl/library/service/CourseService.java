package com.gl.library.service;

import com.gl.library.model.GreatLearning;


public interface CourseService {

	public GreatLearning get();
	public String customInfo(String course, String teacher);
}
