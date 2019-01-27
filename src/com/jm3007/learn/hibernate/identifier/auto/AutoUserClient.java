package com.jm3007.learn.hibernate.identifier.auto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AutoUserClient {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(AutoUser.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			AutoUser autoUser = new AutoUser("Bikas", 20);
			session.save(autoUser);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
