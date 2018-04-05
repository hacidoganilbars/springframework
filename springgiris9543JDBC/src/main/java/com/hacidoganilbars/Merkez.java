package com.hacidoganilbars;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelDAO personelDAO = (IPersonelDAO) context.getBean("personelDAOBean");

		// Personel personel = new Personel("Hamza Fatih", "Sevim", 3);
		// personelDAO.ekle(personel);

		Personel personel = personelDAO.adiAra("Hacı Doğan");
		System.out.println(personel);

		Personel personel2 = personelDAO.idAra(3);
		System.out.println(personel2);

		System.out.println(
				"------------------------------------------------------------------\n-------------------------------------------------------\n\n");
		String gelen = personelDAO.idDegeriyleStringBirVeriyiCekme(3);
		System.out.println(gelen + "\n");

		for (Personel kayit : personelDAO.butunKayitlariAra()) {
			System.out.println(kayit + "------------------");
		}

		context.close();

	}

}
