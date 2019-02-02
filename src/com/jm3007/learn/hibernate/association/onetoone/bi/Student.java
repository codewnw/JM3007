package com.jm3007.learn.hibernate.association.onetoone.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.Mapping;

@Entity
@Table(name = "JM3007_ONETOONE_BI_STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String nationality, StudentDetail studentDetail) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.studentDetail = studentDetail;
	}

	@Column(name = "nationality")
	private String nationality;

	@JoinColumn(name = "STUDENT_DETAIL_ID")
	@OneToOne(cascade = CascadeType.ALL)
	private StudentDetail studentDetail;

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", nationality=" + nationality
				+ ", studentDetail=" + studentDetail + "]";
	}
}
