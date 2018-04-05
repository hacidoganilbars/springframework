package com.hacidoganilbars;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class Merkez {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelDAO personelDAO = (IPersonelDAO) context.getBean("personelDAOBean");

		// Personel personel = new Personel("Emine", "Bip", 4);
		// personelDAO.ekle(personel);

		Personel personel = personelDAO.adiAra("Gülşah");
		System.out.println("adiAra() metodu\n" + personel + "\n\n");

		personel = personelDAO.idAra(3);
		System.out.println("idAra() metodu\n" + personel + "\n\n");

		personel = personelDAO.soyadiAra("İlbars");
		System.out.println("soyadiAra()\n" + personel + "\n\n");

		String sonuc = personelDAO.idDegeriyleStringVeriCekme(2);
		System.out.println("idDegeriyleStringVeriCekme() metodu\n" + sonuc + "\n\n");

		List<Personel> kayitlar = personelDAO.butunKayitlariGetir();
		for (Personel kayit : kayitlar) {
			System.out.println(kayit+"\n---------------------\n\n");
		}
		System.out.println(kayitlar+"\n\n");

	}

}
