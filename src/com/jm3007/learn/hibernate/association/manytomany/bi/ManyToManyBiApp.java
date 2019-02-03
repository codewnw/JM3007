package com.jm3007.learn.hibernate.association.manytomany.bi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyBiApp {

	static SessionFactory sessionFacoty = null;
	static Session session = null;

	public static void main(String[] args) {

		try {
			sessionFacoty = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Person.class)
					.addAnnotatedClass(Address.class)
					.buildSessionFactory();
			session = sessionFacoty.getCurrentSession();

			insert();
//			remove();

		} finally {
			sessionFacoty.close();
		}
	}

	public static void insert() {
		session.beginTransaction();

		Person person1 = new Person("ABC-123");
		Person person2 = new Person("DEF-456");

		Address address1 = new Address("12th Avenue", "12A");
		Address address2 = new Address("18th Avenue", "18B");

		person1.addAddress(address1);
		person1.addAddress(address2);

		person2.addAddress(address1);

//		session.save(person1);
//		session.save(person2);
				
		session.save(address1);
		session.save(address2);

		session.getTransaction().commit();
	}

	public static void remove() {
		session.beginTransaction();

		Person person1 = session.get(Person.class, 1l);
		Address address1 = session.get(Address.class, 1l);
		Address address2 = session.get(Address.class, 1l);

		person1.getAddresses().remove(address1);
		
		session.getTransaction().commit();
	}
}
