package com.jm3007.learn.spring.ioc.lessxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3007/learn/spring/ioc/lessxml/spring-cfg.xml");

		Car car = (Car) context.getBean("car");

		car.driveTheCar();
	}

}
