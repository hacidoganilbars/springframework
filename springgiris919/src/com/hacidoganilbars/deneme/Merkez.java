package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		B b = (B) context.getBean("beanB");
		b.sonucuGoster();
		System.out.println(b.getMesaj() + "   " + b.getSayi());

	}

}
