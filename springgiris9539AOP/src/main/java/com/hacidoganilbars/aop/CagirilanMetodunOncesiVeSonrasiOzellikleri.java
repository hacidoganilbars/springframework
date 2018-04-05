package com.hacidoganilbars.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri {

	public void secilenMetoduSar(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("#### AOP <aop:around> XML ETİKETİ #### " + joinPoint.getSignature().getName()
				+ "() metodundan ÖNCE çalışan metod.");

		System.out.println("#### AOP <aoup:around> XML ETİKETİ #### Çağırılan metodun argümanları: "
				+ Arrays.toString(joinPoint.getArgs()));

		joinPoint.proceed();

		System.out.println("#### AOP <aop:around> XML ETİKETİ #### " + joinPoint.getSignature().getName()
				+ "() metodundan SONRA çalışan metod.\n");

	}

}
