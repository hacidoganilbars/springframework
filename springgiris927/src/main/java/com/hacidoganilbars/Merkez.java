package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.musteri.Musteri;

public class Merkez {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansTumModuller.xml");
		Musteri musteri = context.getBean("beanMusteri", Musteri.class);

		System.out.println("ADI : " + musteri.getAdi() + "\nSOYADI : " + musteri.getSoyadi() + "\nADRESİ : "
				+ musteri.getAdres().getAdres());

		((ConfigurableApplicationContext) context).close();

	}

}
