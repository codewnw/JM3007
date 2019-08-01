package com.jm3007.learn.hibernate.identifier.sequence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_IDENTIFIER_SEQUENCE_USER")
public class SequenceUser {

	@Override
	public String toString() {
		return "IdentityUser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "mySequence", sequenceName = "IDENTIFIER_SEQUENCE", allocationSize = 1, schema = "PUBLIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySequence")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	public SequenceUser(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public SequenceUser() {
		super();
		// TODO Auto-generated constructor stub
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
}
