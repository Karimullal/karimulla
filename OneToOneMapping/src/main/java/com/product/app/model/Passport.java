package com.product.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passport")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String passport_number;
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "passport")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassport_number() {
		return passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passport_number=" + passport_number + "]";
	}
	

}
