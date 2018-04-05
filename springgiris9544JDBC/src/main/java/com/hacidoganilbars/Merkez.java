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

		// Personel personel = new Personel("Özlem", "Koçak", 4);
		// personelDAO.ekle(personel);

		Personel personel = personelDAO.adiAra("Hakan");
		System.out.println(personel + "\n");

		personel = personelDAO.idAra(1);
		System.out.println(personel + "\n");
		
		String deger=personelDAO.idDegeriyleStringVeriCekme(4);
		System.out.println(deger+"\n\n");

		List<Personel> kayitlar = personelDAO.butunkayitlarAra();
		
		for (Personel kayit : kayitlar) {
			
			System.out.println(kayit+"\n-------------\n");
			
		}

		context.close();

	}

}
