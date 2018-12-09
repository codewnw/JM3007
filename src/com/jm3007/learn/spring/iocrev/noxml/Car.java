package com.jm3007.learn.spring.iocrev.noxml;

import org.springframework.stereotype.Component;

@Component("yourCar")
public class Car {

	public void driveTheCar() {
		System.out.println("Driving the car...");
	}
}
