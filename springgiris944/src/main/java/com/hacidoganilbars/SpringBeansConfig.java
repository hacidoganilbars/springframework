package com.hacidoganilbars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfig {

	@Bean
	public Sehir getSehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Osmaniye");
		sehir.setPlaka(80);
		return sehir;
	}

	// <bean id = "beanSehir"class="com.hacidoganilbars.Sehir">
	// <property name = "sehirAdi"value="Osmaniye"/>
	// <property name="plaka"value="80"/>
	// </bean>

	@Bean
	public Ogrenci getOgrenci() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Hacı Doğan");
		ogrenci.setSoyadi("İlbars");
		ogrenci.setSehir(getSehir());
		return ogrenci;
	}
	
	// <bean id = "beanOgrenci"class="com.hacidoganilbars.Ogrenci">
	// <property name = "adi" value="Hacı Doğan"/>
	// <property name="soyadi" value="İlbars"/>
	// <property name="sehir"><ref bean="beanSehir"></property>
 	// </bean>

}
