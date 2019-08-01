package com.jm3007.learn.spring.revision.xmlway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3007/learn/spring/revision/xmlway/spring-cfg.xml");

		Car car1 = (Car) context.getBean("car");
		car1.driveTheCar();

		Car car2 = (Car) context.getBean("car");

		System.out.println("----------------");
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

	}
}
