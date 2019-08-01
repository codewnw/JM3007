package com.jm3007.learn.hibernate.association.onetomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_ONETOMANY_BI_COURSE")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private List<Assignment> assignments;

	public Long getId() {
		return id;
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public void addAssignment(Assignment assignment) {
		if (assignments == null) {
			assignments = new ArrayList<>();
		}
		assignment.setCourse(this);
		assignments.add(assignment);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", assignments=" + assignments + "]";
	}

}
