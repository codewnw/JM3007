package com.jm3007.learn.hibernate.association.onetomany.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_ONETOMANY_BI_ASSIGNMENT")
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Column(name = "name")
	private String name;

	@JoinColumn(name="COURSE_ID")
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Course course;

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

	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assignment(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Assignment [id=" + id + ", name=" + name + "]";
	}

}
