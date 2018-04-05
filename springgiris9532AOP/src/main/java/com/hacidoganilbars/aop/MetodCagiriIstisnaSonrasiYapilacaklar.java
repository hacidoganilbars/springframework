package com.hacidoganilbars.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetodCagiriIstisnaSonrasiYapilacaklar {

	@AfterThrowing(pointcut = "execution(* com.hacidoganilbars.IPersonelServis.adiSoyadiKontrolEt(..))", throwing = "hata")
	public void istisnadanSonrakiGorev(JoinPoint joinPoint, Throwable hata) {

		System.out.println("\n---AspectJ--- " + joinPoint.getSignature().getName()
				+ "() metodun İSTİSNA ALDIĞIKTAN SONRA çalışan metodu.");
		System.out.println(
				joinPoint.getSignature().getName() + "() metodunda meydana gelen istisna türü: " + hata + "\n");

	}

}
