package com.jm3007.learn.spring.di.xml;

public class Car {
	
	private Engine engine;
	
	public void driveTheCar() {
		System.out.println("Driving te car...");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
