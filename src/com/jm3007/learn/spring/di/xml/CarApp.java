package com.jm3007.learn.spring.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3007/learn/spring/di/xml/spring-cfg.xml");
		System.out.println("---------------");
		Engine engine = (Engine) context.getBean("engine");
		System.out.println(engine.hashCode());

		Car car = (Car) context.getBean("car");

//		car.driveTheCar();
		System.out.println("-------------");
		System.out.println(car.hashCode());
		System.out.println(car.getEngine().hashCode());

		Car car2 = (Car) context.getBean("car");
		System.out.println("-------------");
		System.out.println(car2.hashCode());
		System.out.println(car2.getEngine().hashCode());

		System.out.println("---------------");
		Engine engine2 = (Engine) context.getBean("engine");
		System.out.println(engine2.hashCode());

	}

}
