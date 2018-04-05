package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		TernaryOperator ternaryOperator = context.getBean("ternaryOperatorBean", TernaryOperator.class);

		System.out.println(ternaryOperator);
		System.out.println("Sonuc: " + ternaryOperator.isKontrol());

		((ConfigurableApplicationContext) context).close();

	}
}
