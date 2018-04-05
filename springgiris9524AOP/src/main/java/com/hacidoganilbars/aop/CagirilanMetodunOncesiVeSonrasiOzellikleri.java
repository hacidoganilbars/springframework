package com.hacidoganilbars.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		// aynı before metodu gibi davranır
		System.out.println("**** Çağırılan Metodun ÖNCEKİ durumu. ****");

		System.out.println("**** Çağırılan Metodun adı: " + methodInvocation.getMethod().getName() + " ****");

		System.out.println(
				"****Çağırılan Metodun argümanları: " + Arrays.toString(methodInvocation.getArguments()) + " ****");

		try {

			// proceed() normal sıradan bir metod çağırımıdır
			Object result = methodInvocation.proceed();
			// Aynı afterReturning() metodu gibidir
			System.out.println("****Çağırılan metodun SONRAKİ durumu. ****");
			return result;

		} catch (IllegalArgumentException ex) {

			// Aynı afterThrowing() metodu gibidir
			System.out.println("****Çağırılan Metoda İSTİSNA meydana gelme durumu. ****");

			throw ex;
		}

	}

}
