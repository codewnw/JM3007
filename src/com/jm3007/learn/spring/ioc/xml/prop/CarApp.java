package com.jm3007.learn.spring.ioc.xml.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		// Do not create the object by your self
		// Car car = new Car();

		// put the spring-cfg.xml in src folder then this works
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "spring-cfg.xml");
		 */

		// if you put in any package then this works
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3007/learn/spring/ioc/xml/prop/spring-cfg.xml");

		// ask spring to create object for you
		Car car = (Car) context.getBean("car");

		// use the object
		car.driveTheCar();
	}

}
