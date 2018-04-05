package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		PersonelService personelService = context.getBean("personelServisBeanProxy", PersonelService.class);

		try {

			personelService.adiSoyadiKontrolEt();

		} catch (Exception e) {
			System.out.println("PersonelServis Sınıfının adiSoyadiKontrolEt() metodunda istisna oluştu!!!");
			System.out.println("İstisna mesajı: " + e);
		}

		personelService.selamVer("Hoşgeldiniz :) ");
		personelService.personelBilgisiniVer();

		context.close();

	}

}
