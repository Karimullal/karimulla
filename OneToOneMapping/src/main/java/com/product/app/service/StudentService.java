package com.product.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.Student;
import com.product.app.model.StudentResponse;
import com.product.app.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private PassportService passportService;
	
	public Student saveStudentDetails(Student student) {
		passportService.savePassportDetails(student.getPassport());
		return studentRepo.save(student);		 
	}
	
	public List<Student> getAllStudentDetails() {
		return studentRepo.findAll();	 
	}
	
	public Optional<Student> getStudentDetails(Integer id) {
		return studentRepo.findById(id);
	}
	
	public StudentResponse getStudentNameAndPassportNumber(Integer id) {
		return studentRepo.getStudentNameAndPassportNumberById(id);
	}
	
	
}
