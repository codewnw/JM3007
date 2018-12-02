package com.jm3007.learn.spring.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		// Car car = new Car();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3007/learn/spring/ioc/xml/spring-cfg.xml");
		Car car = (Car) context.getBean("car");
		car.driveTheCar();

	}

}
