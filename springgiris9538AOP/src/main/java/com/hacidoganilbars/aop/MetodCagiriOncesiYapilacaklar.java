package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;

public class MetodCagiriOncesiYapilacaklar {

	public void ilkGorev(JoinPoint joinPoint) {

		System.out.println("\n----AOP <aop:before> XML ETİKETİ----\n" + joinPoint.getSignature().getName()
				+ "() isimli metoddan ÖNCE çalışan ilkGorev() metod.");

	}

}
