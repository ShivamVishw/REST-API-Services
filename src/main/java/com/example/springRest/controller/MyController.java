package com.example.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springRest.entities.Courses;
import com.example.springRest.services.CourseService;

@RestController
public class MyController {

	//now make method like konsi request ke liye kya fire karna hai.
	
	@Autowired
	private CourseService courseService;
	
	//Now map this class 
	@GetMapping("/home")
	public String home() {
		return "Welcome to REST Api world";
	}
	
	//get the courses
	//it will return list of courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourses(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses course) {
		return this.courseService.addCourses(course);
	}
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses course) {
		return this.courseService.updateCourses(course);
	}
	
}


