package com.hacidoganilbars.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		// Aynı before gibidir
		System.out.println("****Çağırılan metodun önceki durumu.");

		System.out.println("****Çağırılan metodun adı: " + methodInvocation.getMethod().getName());

		System.out.println("****Çağırılan metodun argümanları: " + methodInvocation.getArguments());

		try {
			// PROCEED, normal sıradan bir metot çağırımıdır.
			Object result = methodInvocation.proceed();
			// Aynı afterReturning metodu gibidir.
			System.out.println("****Çağırılan metodun sonraki durumu.");
			return result;
		} catch (IllegalArgumentException ex) {

			// Aynı afterThrowing metodu gibidir.
			System.out.println("****Çağırılan metoda istisna gelme durumu.");
			throw ex;
		}

	}

}
