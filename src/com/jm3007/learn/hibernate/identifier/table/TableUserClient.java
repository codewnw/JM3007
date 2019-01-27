package com.jm3007.learn.hibernate.identifier.table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TableUserClient {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(TableUser.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			TableUser tableUser = new TableUser("Bikas", 20);
			Long id = (Long)session.save(tableUser);
//			TableUser tableUserFromDb = session.get(TableUser.class, id);
//			System.out.println(tableUserFromDb);
//			tableUserFromDb.setAge(100);
//			System.out.println(tableUserFromDb);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
