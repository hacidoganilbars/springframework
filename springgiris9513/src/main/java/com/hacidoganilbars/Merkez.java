package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Listeler listeler=context.getBean("listelerBean",Listeler.class);
		
		System.out.println(listeler);

	}

}
