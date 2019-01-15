package com.jm3007.learn.spring.revision.xmlway;

public class Car {

	private String color;

	private double speed;

	public void setSpeed(double speed) {
		this.speed = speed;
	}

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
		System.out.println("Driving the " + color + " car at speed of " + speed + " KM/H.");
		musicSystem.playMusic();
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAirBag(AirBag airBag) {
		this.airBag = airBag;
	}
}
