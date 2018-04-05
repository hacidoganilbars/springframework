package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCalistir {
/* spring.xml dosyasında yapılandırma ayarlarında property ile değişkenlere değer verildi
 * name value özelliği property içerisinde kullanıldı
 */
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Ucgen ucgen=(Ucgen) applicationContext.getBean("ucgenim");
		ucgen.ciz();
	}
}
