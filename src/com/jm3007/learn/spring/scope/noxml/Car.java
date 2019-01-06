package com.jm3007.learn.spring.scope.noxml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Car {

	public Car() {
		System.out.println("Car is being constructed.");
	}
}
