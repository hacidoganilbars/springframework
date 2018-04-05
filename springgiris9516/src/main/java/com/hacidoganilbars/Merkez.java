package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Listeler liste = context.getBean("listelerBean", Listeler.class);

		System.out.println(liste);

		RegexKontrol regexKontrol = context.getBean("regExKontrolBean", RegexKontrol.class);
		System.out.println(regexKontrol);

		context.close();
	}

}
