package com.jm3007.learn.hibernate.association.onetomany.uni;

import java.util.ArrayList;
import java.util.List;

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

		/*	Assignment assignemnt1 = new Assignment();
			assignemnt1.setName("CRUD operations");

			Assignment assignemnt2 = new Assignment();
			assignemnt2.setName("Identifeirs");

			List<Assignment> assignments = new ArrayList<>();
			assignments.add(assignemnt1);
			assignments.add(assignemnt2);

			Course course = new Course();
			course.setName("Hibernate");
			course.setAssignments(assignments);*/

//			session.save(course);
			
			Course course = session.get(Course.class, 2L);
			course.setName("Spring");
			course.getAssignments().get(0).setName("CURD operation");

			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}
	}
}
