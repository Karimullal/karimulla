package com.product.app.model;

public class StudentResponse {

	private String studentName;
	private String passportNumber;

	public StudentResponse(String studentName, String passportNumber) {
		this.studentName = studentName;
		this.passportNumber = passportNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public String toString() {
		return "StudentResponse [studentName=" + studentName + ", passportNumber=" + passportNumber + "]";
	}

	
	
}
