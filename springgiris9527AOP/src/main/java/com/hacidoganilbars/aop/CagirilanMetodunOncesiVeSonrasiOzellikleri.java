package com.hacidoganilbars.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("---Çağırılan Metodun önceki durumu.---");
		System.out.println("---Çağırılan Metodun adı: " + methodInvocation.getMethod().getName() + " ---");
		System.out.println(
				"---Çağırılan Metodun Argümanları: " + Arrays.toString(methodInvocation.getArguments()) + " ---");

		try {
			Object result = methodInvocation.proceed();
			System.out.println("---Çağırılan Metodun sonraki durumu.---");
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("---Çağırılan Metotta istisna meydana gelme durumu.---");
			throw e;
		}

	}

}
