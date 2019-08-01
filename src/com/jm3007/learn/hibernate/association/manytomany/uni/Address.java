package com.jm3007.learn.hibernate.association.manytomany.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_MANYTOMANY_UNI_Address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="street")
	private String street;

	@Column(name = "number")
	private String number;

	public Address() {
	}

	public Address(String street, String number) {
		this.street = street;
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public String getStreet() {
		return street;
	}

	public String getNumber() {
		return number;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", number=" + number + "]";
	}
}
