package com.jm3007.learn.spring.di.xml.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String color;

	private int speed;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	private Engine engine;

	@Autowired
	public Car(@Qualifier("suzukiEngine") Engine engine) {
		this.engine = engine;
		System.out.println("Car got the engine.");
		System.out.println("Car is constructed.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...coloe: " + color + " speed: " + speed);
	}
}
