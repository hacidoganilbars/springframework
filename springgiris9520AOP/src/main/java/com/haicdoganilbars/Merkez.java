package com.haicdoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		PersonelServis personelServis = context.getBean("personelServisBeanProxy", PersonelServis.class);

		try {
			personelServis.adiSoyadiKontrolEt();
		} catch (Exception e) {
			System.out.println("PersonelServis sınıfının adiSoyadiKontrolEt() metodunda istisna oluştu!!!");
			System.out.println("İstisna mesajı: " + e);
		}
		personelServis.selamVer("Hoşgeldiniz.:)");
		personelServis.personelBilgisiVer();

	}

}
