package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Sehir sehir = context.getBean("beanSehir", Sehir.class);
		System.out.println(sehir);

		((ConfigurableApplicationContext) context).close();

	}

}
