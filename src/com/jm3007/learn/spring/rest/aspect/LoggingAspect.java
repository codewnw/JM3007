package com.jm3007.learn.spring.rest.aspect;

import java.util.Collections;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.jm3007.learn.spring.rest.model.Customer;

@Component
@Aspect
public class LoggingAspect {

	@Pointcut("execution (* com.jm3007.learn.spring.rest.*.*.*(..))")
	public void allTheMethodsInLayers() {
	}

	@Pointcut("execution (* com.jm3007.learn.spring.rest.*.*.get*(..))")
	public void allGetMethodsInLayers() {
	}

	@Pointcut("execution (* com.jm3007.learn.spring.rest.dao.CustomerDaoImpl.getCustomers(..))")
	public void getCustomersMethodInDao() {
	}

	@Before(value = "allTheMethodsInLayers()")
	public void doSomething(JoinPoint joinPoint) {
		System.out.println(
				">> " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
	}

	@After(value = "allGetMethodsInLayers()")
	public void doAnotherThing(JoinPoint joinPoint) {
		System.out.println("<< " + joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "allGetMethodsInLayers()", returning = "retVal")
	public void afterReturning(Object retVal) {
		if (retVal instanceof Customer) {
			System.out.println(((Customer) retVal).getName());
		}
	}

	@AfterThrowing(pointcut = "allGetMethodsInLayers()", throwing = "ex")
	public void afterThrowing(Exception ex) {
		System.out.println("------" + ex.getMessage());
	}
	
	@Around(value="getCustomersMethodInDao()")
	public void getCustomersMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		//pre-processing: like Before Advice of around
		System.out.println("I'm here");
		
//		Object obj = proceedingJoinPoint.proceed();
		
		//post-processing: like After Advice of around
//		if(obj instanceof List) {
//			System.out.println(((List<Customer>) obj).get(0).getName());
//		}
//		return Collections.emptyList();
	}

}
