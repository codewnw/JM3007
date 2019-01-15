package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonyMusicSystem implements MusicSystem {

	public SonyMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being constructued.");
	}

	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
