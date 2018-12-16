package com.jm3007.learn.spring.ioc.noxml.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String color;

	@Value("20")
	private int speed;

	public void driveTheCar() {
		System.out.println("Driving " + color + " the Car... at speed of " + speed);
	}

	public Car(@Value("Green") String color) {
		this.color = color;
	}

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
}
