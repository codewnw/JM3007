package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.stereotype.Component;

@Component
public class MusicSystem {

	public MusicSystem() {
		System.out.println("MusicSystem is being constructed...");
	}

	public void playMusic() {
		System.out.println("Playing music.");
	}
}
