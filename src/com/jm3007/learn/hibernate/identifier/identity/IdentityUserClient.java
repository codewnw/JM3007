package com.jm3007.learn.hibernate.identifier.identity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class IdentityUserClient {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(IdentityUser.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			IdentityUser autoUser = new IdentityUser("Bikas", 20);
			Long id = (Long)session.save(autoUser);
			IdentityUser identityUser = session.get(IdentityUser.class, id);
			System.out.println(identityUser);
			session.getTransaction().commit();
		} finally {
//			sessionFactory.close();
		}
	}

}
