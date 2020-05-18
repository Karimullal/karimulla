package com.product.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String course_name;
	@OneToMany(mappedBy = "course")
	private List<Review> listReviews = new ArrayList<Review>();
	
	@ManyToMany
	@JoinTable(name = "Student_Course",
	joinColumns = @JoinColumn(referencedColumnName = "id", name = "Course_Id"),
	inverseJoinColumns = @JoinColumn(referencedColumnName = "id", name = "Student_Id"))
	private List<Student> students = new ArrayList<Student>();
	

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public List<Review> getListReviews() {
		return listReviews;
	}

	public void addReview(Review reviews) {
		this.listReviews.add(reviews);
	}

	public void removeReview(Review reviews) {
		this.listReviews.remove(reviews);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + "]";
	}

}
