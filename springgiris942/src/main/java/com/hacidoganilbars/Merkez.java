package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Takip takip = context.getBean("beanTakip", Takip.class);
		takip.getMesaj();

		((ConfigurableApplicationContext) context).close();

	}

}
