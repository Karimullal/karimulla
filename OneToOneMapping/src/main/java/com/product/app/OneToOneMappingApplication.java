package com.product.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.product.app.model.StudentResponse;
import com.product.app.service.CourseService;
import com.product.app.service.PassportService;
import com.product.app.service.ReviewService;
import com.product.app.service.StudentService;

@SpringBootApplication
@Transactional
public class OneToOneMappingApplication implements CommandLineRunner{
	@Autowired
	private StudentService studentService;
	@Autowired
	private PassportService passportService;
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private CourseService courseService;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StudentResponse response = studentService.getStudentNameAndPassportNumber(23);
		System.out.println(response);
	}

}
