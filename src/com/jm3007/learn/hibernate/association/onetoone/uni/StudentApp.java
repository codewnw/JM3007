package com.jm3007.learn.hibernate.association.onetoone.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).addAnnotatedClass(StudentDetail.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

//			StudentDetail studentDetail = new StudentDetail("New Horizon", 1001);
//			Student student = new Student("Satish", 22, "Indian", studentDetail);
//			session.save(student);

			Student std = session.get(Student.class, 1L);
			System.out.println(std);
			
			session.delete(std);

			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}
	}
}
