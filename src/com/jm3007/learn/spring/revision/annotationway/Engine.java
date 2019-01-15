package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine is being constructed...");
	}

	public void start() {
		System.out.println("Engine started.");
	}
}
