package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Yazar yazar = context.getBean("beanYazar", Yazar.class);

		System.out.println("YAZAR: " + yazar.getAdi() + " " + yazar.getSoyadi() + "\nKİTAP: " + yazar.getKitapAdi()
				+ "\nISBN: " + yazar.getKitap().getEserISBN());

		((ConfigurableApplicationContext) context).close();
	}

}
