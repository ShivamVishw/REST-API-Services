package com.example.springRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springRest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	public CourseServiceImpl() {
		list= new ArrayList<>();
		list.add(new Courses(143,"Spring boot","this is java"));
		list.add(new Courses(145,"TOC","Theory of Computation"));
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Courses getCourses(long courseId) {
		// TODO Auto-generated method stub
		Courses c = null;
		for(Courses course:list) {
			if(course.getId()==courseId) {
				c= course;
				break;
			}
		}
		return c;
	}
	
	
	@Override
	public Courses addCourses(Courses course) {

		list.add(course);
		return course;
	}
	
	@Override
	public Courses updateCourses(Courses course) {
		
		list.forEach(e ->{
			
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		
		return course;
	}

}
  