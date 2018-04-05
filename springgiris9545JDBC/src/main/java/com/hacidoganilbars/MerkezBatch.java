package com.hacidoganilbars;

import java.security.Permissions;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.aop.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class MerkezBatch {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelDAO personelDAO = (IPersonelDAO) context.getBean("personelDAOBean");

		Personel personel1 = new Personel("Hacı Doğan", "İlbars", 2);
		Personel personel2 = new Personel("Alihan", "Gödeoğlu", 1);
		Personel personel3 = new Personel("Ahmet", "Gürbüz", 1);
		Personel personel4 = new Personel("Adnan", "İlbars", 30);
		Personel personel5 = new Personel("Hakan", "Ceylan", 2);
		Personel personel6 = new Personel("Ali", "İyidiker", 4);
		Personel personel7 = new Personel("Mustafa", "Solaklı", 2);
		Personel personel8 = new Personel("Gamze", "Yılmaz", 3);
		Personel personel9 = new Personel("Mustafa", "Ergan", 5);
		Personel personel10 = new Personel("Ricardo", "Quaresma", 7);

		List<Personel> personelListesi = new ArrayList<Personel>();
		personelListesi.add(personel10);
		personelListesi.add(personel9);
		personelListesi.add(personel8);
		personelListesi.add(personel7);
		personelListesi.add(personel6);
		personelListesi.add(personel5);
		personelListesi.add(personel4);
		personelListesi.add(personel3);
		personelListesi.add(personel2);
		personelListesi.add(personel1);

		System.out.println("\n\tEKLENECEK LİSTE\n" + personelListesi);
		System.out.println("\n\n KAYIT ÖNCESİ BÜTÜN KAYITLAR\n" + personelDAO.butunKayitlariAra());

		// personelDAO.topluVerisiGirisiBatch1(personelListesi);

		System.out.println("\n\n" + personelDAO.butunKayitlariAra() + "\n\n");

		personelDAO.topluVerisiGirisiBatch2("UPDATE personel SET soyadi='Soyisimdeğişikliği' WHERE soyadi='Solaklı'");

		System.out.println(personelDAO.butunKayitlariAra());

		context.close();

	}

}
