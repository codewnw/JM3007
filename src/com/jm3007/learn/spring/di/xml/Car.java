package com.jm3007.learn.spring.di.xml;

public class Car {
	
	private Engine engine;
	
	public Car() {
		System.out.println("Car is constructed.");
	}

	public void driveTheCar() {
		engine.running();
		System.out.println("Driving the car...");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Putting engine in car.");
		this.engine = engine;
	}
}
