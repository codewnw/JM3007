package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
//		Car car = new Car();
		ApplicationContext context = new AnnotationConfigApplicationContext(SrpingConfig.class);
		Car car = (Car) context.getBean("myCar");
		car.driveTheCar();
	}
}
