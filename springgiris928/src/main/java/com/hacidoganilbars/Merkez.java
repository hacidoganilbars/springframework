package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Personel personel = context.getBean("beanPersonel", Personel.class);

		System.out.println(personel);

		((ConfigurableApplicationContext) context).close();

	}

}
