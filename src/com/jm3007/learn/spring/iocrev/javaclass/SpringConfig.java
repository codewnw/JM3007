package com.jm3007.learn.spring.iocrev.javaclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean(name = "yourCar")
	public Car methodNameDoesNotMatter() {
		return new Car();
	}
}
