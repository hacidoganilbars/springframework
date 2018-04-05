package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCalistir {
/* Program çıktısı=> ## 0 yüksekliğinde 12 Çiz ## şeklinde olur.
 *Sebebi spring.xml yapılandırma dosyasında <constructor-arg value="12"/> değerini verdiğimizdendir
 *burada girilen 12 değeri string değerdir. 
 */
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Ucgen ucgen=(Ucgen) applicationContext.getBean("ucgenim");
		ucgen.ciz();
	}
}
