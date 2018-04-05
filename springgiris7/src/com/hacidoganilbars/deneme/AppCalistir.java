package com.hacidoganilbars.deneme;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCalistir {
/* spring xml yapılandırma dosyasında Ucgen sınıfının yapılandırıcısına girilmesi gereken değerler tipi
 * ile belirtildi. Bu sayede çıkabilecek karışıklıkların önüne geçildi
 */
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Ucgen ucgen=(Ucgen) applicationContext.getBean("ucgenim");
		ucgen.ciz();
	}
}
