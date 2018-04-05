package com.hacidoganilbars.deneme;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@Deprecated
public class AppCalistir {

	public static void main(String[] args) {
		BeanFactory beanFactory=(BeanFactory) new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Araba araba=(Araba) beanFactory.getBean("arabam");
		araba.hareketeGec();
	}
}
