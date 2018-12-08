package com.jm3007.learn.spring.ioc.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = (Car) context.getBean("car");
		car.driveTheCar();
	}

}
