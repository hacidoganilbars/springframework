package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Ders ders = context.getBean("beanDers", Ders.class);

		System.out.println("Adı: " + ders.getOgrenci().getAdi());
		System.out.println("Soyadı: " + ders.getOgrenci().getSoyadi());
		System.out.println("Yaşı: " + ders.getOgrenci().getYasi());
		System.out.println("Dersi: " + ders.getDers());
		System.out.println("Notu: " + ders.getPuan());

		((ConfigurableApplicationContext) context).close();

	}

}
