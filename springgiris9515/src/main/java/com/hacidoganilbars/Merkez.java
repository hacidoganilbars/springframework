package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Listeler liste = context.getBean("listelerBean", Listeler.class);
		System.out.println(liste);

		RegExKontrol regExKontrol = context.getBean("regExKontrolBean", RegExKontrol.class);
		System.out.println(regExKontrol);

		context.close();

	}

}
