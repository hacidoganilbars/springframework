package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.hacidoganilbars.deneme.config.MerkezAppConfig;

public class MerkezApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MerkezAppConfig.class);
		A a = (A) applicationContext.getBean("beana");
		a.yaz("Hacı Doğan İlbars");
		B b = (B) applicationContext.getBean("beanb");
		b.yaz("Spring çalışıyor");
	}

}
