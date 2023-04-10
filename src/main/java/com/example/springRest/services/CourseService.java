package com.example.springRest.services;

import java.util.List;

import com.example.springRest.entities.Courses;

public interface CourseService{

	
	//it will return the list of courses to the controller.
	public List<Courses> getCourses();

	
	public Courses getCourses(long courseId);
	
	public Courses addCourses(Courses course);
	
	public Courses updateCourses(Courses course);
}
