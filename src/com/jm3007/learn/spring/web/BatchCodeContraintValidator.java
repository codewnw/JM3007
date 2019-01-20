package com.jm3007.learn.spring.web;

import static java.util.Optional.*;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BatchCodeContraintValidator implements ConstraintValidator<BatchCode, String> {

	private String prefix;

	@Override
	public void initialize(BatchCode batchCode) {
		this.prefix = batchCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return ofNullable(value).map(nonNullValue -> nonNullValue.startsWith(prefix)).orElse(true);
	}

}
