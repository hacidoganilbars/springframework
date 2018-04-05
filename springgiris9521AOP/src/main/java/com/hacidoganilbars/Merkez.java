package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		PersonelServis personelServis = context.getBean("personelServisBeanProxy", PersonelServis.class);

		try {
			personelServis.adiSoyadiKontrolEt();

		} catch (Exception e) {
			System.out.println("PersonelServis Sınıfının adiSoyadiKontrolEt() metodunda istisna oluştu!!!");
			System.out.println("istisna mesajı: " + e);
		}

		personelServis.selamVer("Hoşgeldiniz..");
		personelServis.personelBilgisiniVer();

		context.close();
	}

}
