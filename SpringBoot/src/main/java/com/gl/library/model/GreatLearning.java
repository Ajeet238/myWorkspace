package com.gl.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
// lombok annotation. It is combination of getter,setter etc automatically
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Builder
// @Data => it will give getter, setter, tostring all
@NoArgsConstructor // create no args constructor
@AllArgsConstructor // create all args constructor
public class GreatLearning {	
	 private String course;
	 private String teacher;
	 private College college;
	 
// parameterized cunstructor  
//	public GreatLearning(String course, String teacher) {
//		super();
//		this.course = course;
//		this.teacher = teacher;
//	}
	 
	 
}
