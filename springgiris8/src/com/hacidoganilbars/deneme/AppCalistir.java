package com.hacidoganilbars.deneme;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCalistir {
/* spring.xml ayar dosyasında index numaralarına göre Ucgen sınıfının yapılandırıcısına sırası ile
 * değerler verildi. Ucgen sınıfı içerisinde kurucu metodların istediğ parametre sırasını dikkate aldı.
 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Ucgen ucgen=(Ucgen) applicationContext.getBean("ucgenim");
		ucgen.ciz();
	}
}
