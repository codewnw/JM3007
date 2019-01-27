package com.jm3007.learn.hibernate.identifier.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "JM3007_IDENTIFIER_TABLE_USER")
public class TableUser {

	@Override
	public String toString() {
		return "IdentityUser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Id
	@Column(name = "id")
	@TableGenerator(name = "mySequence", table = "JM3007_IDENTIFIER_SEQUENCE_TABLE", pkColumnName = "SEQ_NAME", pkColumnValue = "IDENTIFIER_TABLE_SEQUENCE", valueColumnName = "NEXT_VAL", allocationSize = 1, schema = "PUBLIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySequence")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	public TableUser(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public TableUser() {
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
