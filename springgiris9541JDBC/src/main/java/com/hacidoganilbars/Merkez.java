package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelDAO personelDAO = (IPersonelDAO) context.getBean("personelDAOBean");

		Personel personel = new Personel("Seçkin", "İlbars", 3);
		personelDAO.ekle(personel);

		System.out.println(personelDAO.adiAra("Seçkin"));
		System.out.println(	personelDAO.tecrubeyiAra(4));

		context.close();

	}

}
