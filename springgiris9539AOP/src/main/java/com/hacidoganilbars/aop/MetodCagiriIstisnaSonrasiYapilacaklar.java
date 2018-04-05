package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;

public class MetodCagiriIstisnaSonrasiYapilacaklar {

	public void istisnadanSonrakiGorev(JoinPoint joinPoint, Throwable hata) {

		System.out.println("---- AOP <aop:after-throwing> XML ETİKETİ ----\n" + joinPoint.getSignature().getName()
				+ "() isimli metodun İSTİSNADAN SONRA çalışan metodu.");
		System.out.println(
				joinPoint.getSignature().getName() + "() metodunda meydana gelen \nistisna türü: " + hata + "\n");

	}

}
