package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.stereotype.Component;

@Component
public class AirBag {

	public AirBag() {
		System.out.println("AirBag is bieng constructed...");
	}

	public void acivate() {
		System.out.println("AirBag has been activated.");
	}
}
