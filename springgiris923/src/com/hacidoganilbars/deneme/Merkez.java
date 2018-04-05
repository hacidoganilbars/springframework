package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Ogrenci ogrenci = context.getBean("beanOgrenci", Ogrenci.class);
		
		ogrenci.getOgrenciList();
		ogrenci.getOgrenciSet();
		ogrenci.getOgrenciMap();
		ogrenci.getOgrenciProperties();
		
//		((AbstractApplicationContext)context).close();
		((ConfigurableApplicationContext)context).close();

	}

}
