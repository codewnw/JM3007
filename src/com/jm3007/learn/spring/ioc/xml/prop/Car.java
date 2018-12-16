package com.jm3007.learn.spring.ioc.xml.prop;

public class Car {

	private String color;

	private int speed;

	private int gear;

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("Setting color");
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		System.out.println("Setting speed");
		this.speed = speed;
	}

	public Car() {
		System.out.println("Car is being constructed using no arg constructor");
	}

	public Car(String newColor) {
		this.color = newColor;
		System.out.println("Car is being constructed using single arg constructor");
	}

	public Car(String newColor, int newSpeed) {
		this.color = newColor;
		this.speed = newSpeed;
		System.out.println("Car is being constructed using double arg constructor");
	}

	public void driveTheCar() {
		System.out.println("Driving " + color + " the Car... at speed of " + speed + " on gear " + gear);
	}
}
