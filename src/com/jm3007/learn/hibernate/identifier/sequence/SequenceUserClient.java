package com.jm3007.learn.hibernate.identifier.sequence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SequenceUserClient {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(SequenceUser.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			SequenceUser sequenceUser = new SequenceUser("Bikas", 20);
			Long id = (Long)session.save(sequenceUser);
			SequenceUser sequenceUserFromDb = session.get(SequenceUser.class, id);
			System.out.println(sequenceUserFromDb);
			sequenceUserFromDb.setAge(100);
			System.out.println(sequenceUserFromDb);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
