package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetodunGeriDonusDegeriSonrasiYapilacaklar {

	@AfterReturning(pointcut = "execution(* com.hacidoganilbars.IPersonelServis.selamVer(..))", returning = "sonuc")
	public void geriDonusSonrasiGorev(JoinPoint joinPoint, Object sonuc) {

		System.out.println("---AspectJ--- " + joinPoint.getSignature().getName()
				+ "() metodun GERİ DÖNÜŞ DEĞERİNDEN SONRA çalışan metod.");
		System.out.println(joinPoint.getSignature().getName() + "() metodunun geri dönüş değeri: " + sonuc);

	}
}
