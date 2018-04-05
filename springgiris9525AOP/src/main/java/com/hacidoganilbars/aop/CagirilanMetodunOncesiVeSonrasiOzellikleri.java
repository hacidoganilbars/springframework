package com.hacidoganilbars.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("**** Çağırılan Metodun ÖNCEKİ durumu. ****");

		System.out.println("**** Çağırılan metodun adı: " + methodInvocation.getMethod().getName() + " ****");

		System.out.println("**** Çağırılan metodun argümanları: " + methodInvocation.getArguments() + " ****");

		try {
			Object result = methodInvocation.proceed();
			System.out.println("**** Çağırılan Metodun SONRAKİ durumu. ****");
			System.out.println("***************HACI DOĞAN İLBARS *******************");
			return result;
		} catch (IllegalArgumentException ex) {
			System.out.println("**** Çağırılan metoda İSTİSNA meydana gelme durumu. ****");

			throw ex;

		}
		
	}
	

}
