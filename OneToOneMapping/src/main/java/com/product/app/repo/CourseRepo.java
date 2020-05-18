package com.product.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
