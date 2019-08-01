package com.jm3007.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			// my opereation
//			User user = new User(3L, "Virat", 59);
//			session.save(user);
			
			User user = session.get(User.class, 1L);
			System.out.println(user.getName());
			
			/*List<User> users = session.createQuery("from User").getResultList();
			for (User user : users) {
				System.out.println(user.getName());
			}*/
			
			/*List<User> users = session.createQuery("from User u where u.name = 'Virat'").getResultList();
			for (User user : users) {
				System.out.println(user.getName());
			}*/
			
//			User user = session.get(User.class, 2L);
//			user.setName("Sachin");
			
//			User user = session.get(User.class, 1L);
//			session.delete(user);
			

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
