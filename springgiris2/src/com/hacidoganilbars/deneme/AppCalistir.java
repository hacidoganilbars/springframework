package com.hacidoganilbars.deneme;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Deprecated
public class AppCalistir {

	public static void main(String[] args) {
		Resource resource=new FileSystemResource("spring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		BeanFactory beanFactory = (BeanFactory) new XmlBeanFactory(new FileSystemResource("spring.xml"));

//		ClassPathResource resource = new ClassPathResource("spring.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Araba araba = (Araba) beanFactory.getBean("arabam");
		araba.hareketeGec();
		araba = (Araba) beanFactory.getBean("arabam1");
		araba.hareketeGec();
		araba = (Araba) beanFactory.getBean("arabam2");
		araba.hareketeGec();
	}
}
