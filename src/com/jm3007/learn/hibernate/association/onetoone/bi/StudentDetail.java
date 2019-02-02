package com.jm3007.learn.hibernate.association.onetoone.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_ONETOONE_BI_STUDENT_DETAIL")
public class StudentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "college_name")
	private String collegeName;

	@Column(name = "ROLL_NO")
	private Integer rollNo;
	
	@OneToOne(cascade = {CascadeType.ALL}, mappedBy="studentDetail")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getId() {
		return id;
	}

	public StudentDetail(String collegeName, Integer rollNo) {
		super();
		this.collegeName = collegeName;
		this.rollNo = rollNo;
	}

	public StudentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", collegeName=" + collegeName + ", rollNo=" + rollNo + "]";
	}


}
