package com.jm3007.learn.spring.iocrev.javaclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car = (Car) context.getBean("yourCar");
		car.driveTheCar();
	}

}
