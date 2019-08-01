package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.stereotype.Component;

@Component("philips")
public class PhilipsMusicSystem implements MusicSystem {

	public PhilipsMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being constructued.");
	}

	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
