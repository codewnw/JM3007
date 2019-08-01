package com.jm3007.learn.hibernate.association.manytomany.uni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyUniApp {

	static SessionFactory sessionFacoty = null;
	static Session session = null;

	public static void main(String[] args) {

		try {
			sessionFacoty = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class)
					.addAnnotatedClass(Address.class).buildSessionFactory();
			session = sessionFacoty.getCurrentSession();

//			 insert();
//			getPerson();
//			addOneMoreAddressInExistingPerson();
			 remove();

		} finally {
			sessionFacoty.close();
		}
	}

	private static void addOneMoreAddressInExistingPerson() {
		session.beginTransaction();

		Person p = session.get(Person.class, 1L);
		List<Address> addrs = p.getAddresses();

		Address address3 = new Address("Marathalli", "HDFC Bank");
		addrs.add(address3);

		session.getTransaction().commit();
	}

	private static void getPerson() {
		session.beginTransaction();

		Person p = session.get(Person.class, 1L);
		System.out.println(p);

		session.getTransaction().commit();

	}

	public static void insert() {
		session.beginTransaction();

		Person person1 = new Person("Atul");
		Person person2 = new Person("At");

		Address address1 = new Address("12th Avenue", "12A");
		Address address2 = new Address("18th Avenue", "18B");

		person1.getAddresses().add(address1);
		person1.getAddresses().add(address2);

		person2.getAddresses().add(address1);

		session.save(person1);
		session.save(person2);

		session.getTransaction().commit();
	}

	public static void remove() {
		session.beginTransaction();

//		Person person1 = session.get(Person.class, 1l);
		Person person2 = session.get(Person.class, 2l);
//		Address address1 = session.get(Address.class, 1l);

//		person1.getAddresses().remove(address1);
		 session.remove(person2);
		session.getTransaction().commit();
	}
}
