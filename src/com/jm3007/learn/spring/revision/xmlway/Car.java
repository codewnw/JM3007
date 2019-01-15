package com.jm3007.learn.spring.revision.xmlway;

public class Car {

	private Engine engine;
	
	private AirBag airBag;
	
	private MusicSystem musicSystem;

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

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

	public void setAirBag(AirBag airBag) {
		this.airBag = airBag;
	}
}
