package com.hacidoganilbars;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.aop.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class Merkez {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelDAO personelDAO = (IPersonelDAO) context.getBean("personelDAOBean");

		// Personel personel = new Personel("Fatih", "Sevim", 1);
		//
		// personelDAO.ekle(personel);

		Personel personel = personelDAO.adiAra("Fatih");
		System.out.println(personel + "\n\n");

		personel = personelDAO.idAra(2);
		System.out.println(personel + "\n\n");

		List<Personel> kayitlar = personelDAO.butunKayitlariAra();
		for (Personel personeller : kayitlar) {
			System.out.println(personeller + "\n-----------------\n\n");
		}

		String sonuc = personelDAO.idDegeriyleStringBirVeriyiCekme(2);
		System.out.println(sonuc);

		context.close();
	}

}
