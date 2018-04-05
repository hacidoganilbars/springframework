package com.hacidoganilbars.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("---Çağırılan metodun ÖNCEKİ durumu.");
		System.out.println("---Çağırılan metodun adı: " + methodInvocation.getMethod().getName());
		System.out.println("---Çağırılan metodun argümanları: " + Arrays.toString(methodInvocation.getArguments()));

		try {
			Object result = methodInvocation.proceed();
			System.out.println("---Çağırılan metodun SONRAKİ durumu.\n\n");
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("Çağırılan metodda İSTİSNA meydana gelme durumu.\n");
			throw e;
		}
	}

}
