package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;

public class MetodCagiriSonrasiYapilacaklar {

	public void sonGorev(JoinPoint joinPoint) {
		System.out.println("---- AOP <aop:after> XML ETİKETİ ----\n" + joinPoint.getSignature().getName()
				+ "() isimli öetoddan SONRA çalışan sonGorev() metodu.\n");
	}

}
