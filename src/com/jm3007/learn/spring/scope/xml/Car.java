package com.jm3007.learn.spring.scope.xml;

public class Car {

	public Car() {
		System.out.println("Car is being constructed.");
	}
	
	public void mysdnkksn() {
		System.out.println("I'm ruuning after post construct...");
	}
	
	public void cleanUp() {
		System.out.println("Clean up");
	}
}
