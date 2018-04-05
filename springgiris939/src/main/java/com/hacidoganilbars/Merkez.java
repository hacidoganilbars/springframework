package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//xml ayar dosyasında <!-- <property name="yasi" value="30"/> --> etiketi kaldırırsanız hata verecektir @Required boş geçilmez
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Ogrenci ogrenci = context.getBean("beanOgrenci", Ogrenci.class);
		System.out.println("Adı: "+ogrenci.getAdi());
		System.out.println("Soyadı: "+ogrenci.getSoyadi());
		System.out.println("Yaşı: "+ogrenci.getYasi());

	}
}
