package com.hacidoganilbars;

import java.util.Random;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelDAO personelDAO = (IPersonelDAO) context.getBean("personelDAOBean");

		Random random = new Random();
		int rastgeleSayi = random.nextInt(20);

		Personel personel = new Personel("Ahmet", "Topaloğlu", rastgeleSayi);
		personelDAO.createOlustur2(personel);
		
		personelDAO.readOku2(7);
		
		context.close();

	}

}
