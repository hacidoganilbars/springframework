package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
		System.out.println("Adı: " + ogrenci.getAdi() + "\nSoyadı: " + ogrenci.getSoyAdi() + "\nNumarası: "
				+ ogrenci.getNumarasi() + "\nÜniversitesi: " + ogrenci.getUniversitesi().getKurumAdi());

	}

}
