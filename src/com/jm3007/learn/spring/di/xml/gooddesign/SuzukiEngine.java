package com.jm3007.learn.spring.di.xml.gooddesign;

public class SuzukiEngine implements Engine {

	public SuzukiEngine() {
		System.out.println(this.getClass().getSimpleName() + " is constructed");
	}

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}

}
