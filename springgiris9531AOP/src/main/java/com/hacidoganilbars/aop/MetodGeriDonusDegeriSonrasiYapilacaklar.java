package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetodGeriDonusDegeriSonrasiYapilacaklar {

	@AfterReturning(pointcut = "execution(* com.hacidoganilbars.IPersonelServis.selamVer(..))", returning = "sonuc")
	public void geriDonusSonrsiGorev(JoinPoint joinPoint, Object sonuc) {

		System.out.println("\n---AspectJ--- " + joinPoint.getSignature().getName()
				+ " () isimli metodun GERİ DONÜŞ DEĞERİNDEN SONRA çalışan metot.");

		System.out.println(joinPoint.getSignature().getName() + "() metodunun geri dönüş değeri: " + sonuc + "\n");
	}

}
