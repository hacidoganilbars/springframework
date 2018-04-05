package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Koleksiyonlar koleksiyonlar = context.getBean("beanKoleksiyonlar", Koleksiyonlar.class);
		System.out.println(koleksiyonlar);

		((ConfigurableApplicationContext) context).close();

	}

}
