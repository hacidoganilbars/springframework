package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;

public class MetodunGeriDonusDegeriSonrasiYapilacaklar {

	public void geriDonusSonrasiGorev(JoinPoint joinPoint, Object sonuc) {

		System.out.println("---- AOP <aop:after-returning> XML ETİKETİ ----\n" + joinPoint.getSignature().getName()
				+ "() isimli metodun GERİ DÖNÜŞ DEĞERİNDEN SONRA çalışan metod.");

		System.out.println(joinPoint.getSignature().getName() + "() metodunun geri dönüş değeri: " + sonuc);

	}

}
