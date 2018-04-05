package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Selam selam=(Selam) applicationContext.getBean("selamim");
		selam.mesajGoster();
		System.out.println("ahmet\nmehmet");
	}
	

}
