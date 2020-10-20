package com.vladancupric;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logovanje {
	
	@Pointcut("execution(* com.vladancupric.*.*(..))")
	private void odaberiSve() {
		
	}
	@Before("odaberiSve()")
	public void beforeSavet() {
		System.out.println("Krecem sa podesavanjem studentskog profila");
	}

}
