package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;

//@Aspect

public class MetodCagiriOncesiYapilacaklar {

//	@Before("execution(* com.hacidoganilbars.IPersonelServis.selamVer(..))")
	public void ilkGorev(JoinPoint joinPoint) {

		System.out.println("---- AOP <aop:before> XML ETİKETİ ---- \n" + joinPoint.getSignature().getName()
				+ "() isimli metottan MNCE çalışan ilkGorev() metodu.");

	}

}
