package com.jm3007.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_USER")
public class User {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	public User(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User() {
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
