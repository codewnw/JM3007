package com.jm3007.learn.hibernate.association.onetoone.bi;

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

			StudentDetail studentDetail = new StudentDetail("New Horizon", 1001);
			Student student = new Student("Satish", 22, "Indian", studentDetail);
			studentDetail.setStudent(student);
			
			
//			session.save(studentDetail);

			StudentDetail std = session.get(StudentDetail.class, 1L);
			System.out.println(std);
			System.out.println(std.getStudent());

			session.getTransaction().commit();

		} finally {
		}
	}
}
