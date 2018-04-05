package com.hacidoganilbars.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("****Çağırılan Metodun Önceki durumu.****");
		System.out.println("****Çağırılan Metodun adı: " + methodInvocation.getMethod().getName() + " ****");
		System.out.println(
				"****Çağırılan Metodun Argümanları: " + Arrays.toString(methodInvocation.getArguments()) + " ****");

		try {
			// proceed normal sıradan bir metod
			Object result = methodInvocation.proceed();
			System.out.println("****Çağırılan Metodun sonraki durumu.****\n\n");
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("****Çağırılan Metodda İSTİSNA meydana gelme durumu.****\n");
			throw e;
		}
	}

}
