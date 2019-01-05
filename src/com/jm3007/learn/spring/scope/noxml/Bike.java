package com.jm3007.learn.spring.scope.noxml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bike {

	public Bike() {
		System.out.println("Bike is being created.");
	}

}
