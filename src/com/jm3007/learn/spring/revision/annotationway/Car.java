package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {

	private Engine engine;

	// dependency injection - thru field
	@Autowired
	private MusicSystem musicSystem;

	private AirBag airBag;

	// dependency injection - thru constructor
	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car is being constructed...");
	}

	public void driveTheCar() {
		engine.start();
		airBag.acivate();
		System.out.println("Driving the car.");
		musicSystem.playMusic();
	}

	// dependency injection - thru setter
	@Autowired
	public void setAirBag(AirBag airBag) {
		this.airBag = airBag;
	}
}
