package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelServis personelServis = (IPersonelServis) context.getBean("personelServisBean");
		personelServis.adiSoyadiKontrolEt();
		personelServis.selamVer("Hoşgeldiniz");
		personelServis.personelBilgisiniAl();
		context.close();

	}

}
