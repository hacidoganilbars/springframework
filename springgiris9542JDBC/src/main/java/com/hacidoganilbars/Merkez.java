package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.dao.IPersoneDAO;
import com.hacidoganilbars.enterprise.Personel;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersoneDAO personelDAO=(IPersoneDAO) context.getBean("personelDAOBean");

		Personel personel = new Personel("Sinem", "Toprak", 3);
		personelDAO.ekle(personel);

		personel = personelDAO.idAra(2);
		System.out.println(personel);

		personel = personelDAO.adiAra("Gülden");
		System.out.println(personel);

		context.close();

	}

}
