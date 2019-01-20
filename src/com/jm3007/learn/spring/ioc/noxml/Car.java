package com.jm3007.learn.spring.ioc.noxml;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void driveTheCar() {
		System.out.println("Driving the Car...");
	}
}
