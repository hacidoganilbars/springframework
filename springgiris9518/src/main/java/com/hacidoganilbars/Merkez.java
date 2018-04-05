package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		context.start();// context ayağa kaldırılıyor

		Sozler sozler = context.getBean("sozlerBean", Sozler.class);
		sozler.ekranaYaz();

		context.stop();// context durduruluyor

		context.close();// context kapatılıyor

	}

}
