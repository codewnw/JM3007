package com.jm3007.learn.spring.scope.noxml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Car {

	public Car() {
		System.out.println("Car is being constructed.");
	}
	
	@PostConstruct
	public void doSomethingAfterBeanIsConstructed() {
		System.out.println("Car is constructed successfully.");
	}
	
	@PreDestroy
	public void doSomethingBeforeBeanIsDestroyed() {
		System.out.println("Car is going to be destroyed.");
	}
}
