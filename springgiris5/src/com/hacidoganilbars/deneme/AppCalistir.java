package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCalistir {
/* 
 * spring.xml dosyasında Ucgen sınıfının kurucu metoduna ilk değer atamaları yapıldı
 * Spring değerleri bizim için uygun yerlere koydu 
 */
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Ucgen ucgen=(Ucgen) applicationContext.getBean("ucgenim");
		ucgen.ciz();
	}
}
