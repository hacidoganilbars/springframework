package com.hacidoganilbars;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBeansConfig.class);
		context.refresh();

		Ogrenci ogrenci = context.getBean(Ogrenci.class);

		System.out.println("Adı: " + ogrenci.getAdi());
		System.out.println("Soyadı: " + ogrenci.getSoyadi());
		System.out.println("Şehir: " + ogrenci.getSehir().getSehirAdi());
		System.out.println("Plaka: " + ogrenci.getSehir().getPlaka());

	}

}
