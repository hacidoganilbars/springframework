package com.hacidoganilbars.aop;

import org.springframework.aop.ThrowsAdvice;

public class MetodCagiriIstisnaSonrasiYapilacaklar implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException exception) throws Throwable {
		
		System.out.println("---Spring AOP ile metodlardaki bir İSTİSNA sonrası çalışan afterThrowing metodu---\n");
		
	}

}
