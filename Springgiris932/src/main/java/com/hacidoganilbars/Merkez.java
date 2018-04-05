package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Ayar ayar = context.getBean("beanAyar", Ayar.class);
		System.out.println(ayar);
		ayar.sonucuYaz();

		((ConfigurableApplicationContext) context).close();

	}

}
