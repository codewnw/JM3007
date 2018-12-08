package com.jm3007.learn.spring.ioc.javaclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Car car() {
		return new Car();
	}
}
