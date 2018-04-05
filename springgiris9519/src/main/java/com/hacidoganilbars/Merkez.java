package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		context.start();

		Sozler sozler = context.getBean("sozlerBean", Sozler.class);
		sozler.ekranaYaz();

		CustomOlayYayinlayicisi olayYayinlayicisi = context.getBean("customOlayYayinlayicisiBean",
				CustomOlayYayinlayicisi.class);

		olayYayinlayicisi.yayinla();
		olayYayinlayicisi.yayinla();
		olayYayinlayicisi.yayinla();

		context.stop();

		context.close();

	}

}
