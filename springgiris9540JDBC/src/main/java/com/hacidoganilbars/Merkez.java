package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;
import com.hacidoganilbars.impl.PersonelDAOImpl;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		IPersonelDAO personelDAO = context.getBean("personelDAOBean", PersonelDAOImpl.class);

		Personel personel = new Personel("Özlem", "Koçak", 2);
//		personelDAO.ekle(personel);

		personel = personelDAO.idAra(5);
		System.out.println(personel);

		personel = personelDAO.adiAra("Özlem");
		System.out.println(personel);

		context.close();

	}

}
