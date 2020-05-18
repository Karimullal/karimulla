package com.product.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.Course;
import com.product.app.repo.CourseRepo;

@Service
public class CourseService {
	@Autowired
	private CourseRepo courseRepo;
	
	public Course saveCourse(Course course) {
		return courseRepo.save(course);
	}
	
	public Optional<Course> getById(int id) {
		return courseRepo.findById(id);
	}
}
