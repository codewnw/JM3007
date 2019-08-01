package com.jm3007.learn.spring.web;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@NotNull(message = " enter valid name")
	@Size(min = 2, max = 12, message = " name should not be less than 2 characters")
	@Size(max = 12, message = " name should not be more than 12 characters")
	private String name;

	@Min(value = 18, message = " age should not be less than 18")
	@Max(value = 60, message = " age should not be more than 60")
	private int age;

	private String gender;

	private String country;

	private String[] courses;

	private boolean graduated;

	private String feedback;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past(message = " must be in past")
	private Date dob;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Future(message = " must be in future")
	private Date lastBatchDate;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getLastBatchDate() {
		return lastBatchDate;
	}

	public void setLastBatchDate(Date lastBatchDate) {
		this.lastBatchDate = lastBatchDate;
	}

	@BatchCode(value = "JM2", message = " prefix should be JM2")
	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = " should not contain special characters")
	private String batchCode;

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

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
