package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Selam selam = (Selam) context.getBean("selam");
		// selam1.goster();
		System.out.println(selam.getMesaj1() + "\n" + selam.getMesaj2() + "\n\n\n");

		Yazar yazar = (Yazar) context.getBean("yazar");
		yazar.goster();

	}

}
