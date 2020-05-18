package com.product.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.app.model.Student;
import com.product.app.model.StudentResponse;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	
	  @Query(value =
	  "Select new com.product.app.model.StudentResponse(s.student_name,p.passport_number)  from com.product.app.model.Student s JOIN s.passport p"
	  ) public StudentResponse getStudentNameAndPassportNumberById(int student_id);
	 
}
