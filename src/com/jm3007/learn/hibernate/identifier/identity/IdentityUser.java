package com.jm3007.learn.hibernate.identifier.identity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_IDENTIFIER_IDENTITY_USER")
public class IdentityUser {

	@Override
	public String toString() {
		return "IdentityUser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	public IdentityUser(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public IdentityUser() {
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
