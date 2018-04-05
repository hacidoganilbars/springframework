package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Yazar yazar = context.getBean("beanYazar", Yazar.class);

		System.out.println(" YAZAR: " + yazar.getAdi() + " " + yazar.getSoyAdi() + "\nKİTAP: " + yazar.getKitapAdi()
				+ "\nISBN: " + yazar.getKitap().getEserISBN());

		System.out.println(yazar.getBilgi());

		context.close();

	}

}
