package com.jm3007.learn.hibernate.association.manytomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3007_MANYTOMANY_BI_Person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = { CascadeType.ALL })
	private List<Address> addresses = new ArrayList<>();

	public Person() {
	}

	public List<Address> getAddresses() {
		return addresses;
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

	public Person(String name) {
		super();
		this.name = name;
	}

	//hand-shaking method
	public void addAddress(Address address) {
		addresses.add(address);
		address.getOwners().add(this);
	}

	public void removeAddress(Address address) {
		addresses.remove(address);
		address.getOwners().remove(this);
	}
}
