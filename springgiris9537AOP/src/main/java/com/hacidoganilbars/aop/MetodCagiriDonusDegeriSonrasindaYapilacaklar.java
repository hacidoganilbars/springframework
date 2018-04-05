package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;

public class MetodCagiriDonusDegeriSonrasindaYapilacaklar {

	public void geriDonusSonrasiGorev(JoinPoint joinpoint,Object sonuc) {

		System.out.println("---- AOP <aop:after-returning> XML ETİKETİ ----\n" + joinpoint.getSignature().getName()
				+ "() isimli metodun GERİ DÖNÜŞ DEĞERİNDEN SONRA çalışan metod.");
		
		System.out.println(joinpoint.getSignature().getName()+"() metodun geri dönüş değeri: "+sonuc);

	}

}
