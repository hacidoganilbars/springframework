package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetodCagiriSonrasiYapilacaklar {

	@After("execution(* com.hacidoganilbars.IPersonelServis.selamVer(..))")
	public void sonGorev(JoinPoint joinPoint) {
		System.out.println("---AspectJ--- " + joinPoint.getSignature().getName()
				+ "() isimli metottan sonra çalışan sonGorev() metodu.\n");

	}

}
