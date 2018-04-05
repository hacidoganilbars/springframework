package com.haicdoganilbars.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MetodCagiriOncesiYapilacaklar implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("\n---Spring AOP ile her metottan ÖNCE devreye giren BEFORE metodu.---");
	}

}
