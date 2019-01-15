package com.jm3007.learn.spring.revision.xmlway;

public class PhilipsMusicSystem implements MusicSystem {

	public PhilipsMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being constructued.");
	}

	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
