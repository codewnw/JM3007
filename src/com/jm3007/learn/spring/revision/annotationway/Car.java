package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCar")
//@Scope("singleton")
@Scope("prototype")
public class Car {

	@Value("${color}")
	private String color;

	@Value("${speed}")
	private double speed;

	private Engine engine;

	// dependency injection - thru field
	@Qualifier("sony")
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
		System.out.println("Driving the " + color + " car at speed of " + speed + " KM/H.");
		musicSystem.playMusic();
	}

	// dependency injection - thru setter
	@Autowired
	public void setAirBag(AirBag airBag) {
		this.airBag = airBag;
	}
}
