package com.hacidoganilbars.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MetodCagiriSonrasiYapilacaklar implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("---Spring AOP ile her metottan SONRA devreye giren afterReturning() metodu---\n\n");
	}

}
