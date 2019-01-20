package com.jm3007.learn.spring.web;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = BatchCodeContraintValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface BatchCode {
	public String value() default "JM3";

	public String message() default " prefix should be JM3";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
