package com.jm3007.learn.spring.di.xml.noxml;

import org.springframework.stereotype.Component;

@Component
public class AshokaLeyLandEngine implements Engine {
	public AshokaLeyLandEngine() {
		System.out.println(this.getClass().getSimpleName() + " is constructed");
	}

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}

}
