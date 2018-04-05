package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowiring'in no özelliği
public class Merkez {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Calisan calisan = context.getBean("calisan", Calisan.class);
		System.out.println(calisan);

	}

}
