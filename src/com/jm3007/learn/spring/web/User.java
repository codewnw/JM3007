package com.jm3007.learn.spring.web;

public class User {
	private String name;

	private int age;

	private String gender;

	private String country;
	
	private String[] courses;
	
	private boolean graduated;
	
	private String feedback;

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public boolean isGraduated() {
		return graduated;
	}

	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
