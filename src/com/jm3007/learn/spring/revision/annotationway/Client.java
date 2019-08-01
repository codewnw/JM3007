package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
//		Car car = new Car();
		ApplicationContext context = new AnnotationConfigApplicationContext(SrpingConfig.class);
		Car car1 = (Car) context.getBean("myCar");
		car1.driveTheCar();
		
		
		Car car2 = (Car) context.getBean("myCar");
		
		
		System.out.println("--------------");
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		
	}
}
