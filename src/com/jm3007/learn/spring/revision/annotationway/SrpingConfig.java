package com.jm3007.learn.spring.revision.annotationway;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.jm3007.learn.spring.revision.annotationway")
@PropertySource(value = "classpath:car.properties")
public class SrpingConfig {

}
