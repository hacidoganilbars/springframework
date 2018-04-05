package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.matematik.HesapMakinesi;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context =  new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		HesapMakinesi hesapMakinesi = context.getBean("beanHesapMakinesiComponent", HesapMakinesi.class);

		hesapMakinesi.sonuclariGetir(671, 532);

		((ConfigurableApplicationContext) context).close();
	}

}
