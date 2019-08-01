package com.jm3007.learn.hibernate.association.onetomany.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CourseApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Assignment.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			/*Assignment assignemnt = new Assignment("Bi Directional 1");
			Course course = new Course("Mapping");
			course.addAssignment(assignemnt);
			session.save(assignemnt);
			session.getTransaction().commit();
*/
			
		/*	Assignment assignemnt = new Assignment("Bi Directional 1");
			Course course = session.get(Course.class, 2L);
			course.addAssignment(assignemnt);
			session.save(assignemnt);
			session.getTransaction().commit();*/
			
		Assignment assignment = session.get(Assignment.class, 3L);
			session.delete(assignment);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
