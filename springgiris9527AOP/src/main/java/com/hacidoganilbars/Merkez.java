package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		PersonelServis personelServis = context.getBean("personelServisBean", PersonelServis.class);
		personelServis.adiSoyadiKontrolEt();
		personelServis.selamVer("Hoşgeldiniz");
		personelServis.personelBilgisiniAl();
		context.close();

	}

}
