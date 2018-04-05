package com.hacidoganilbars;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class MerkezBatch {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		IPersonelDAO personelDAO = (IPersonelDAO) context.getBean("personelDAOBean");
		Personel p1 = new Personel("Adnan", "İlbars", 30);
		Personel p2 = new Personel("Ahmet", "Topaloğlu", 15);
		Personel p3 = new Personel("Erhan", "Güleç", 12);
		Personel p4 = new Personel("Bülent", "Kundakçı", 8);
		Personel p5 = new Personel("Ufuk", "Gelen", 3);

		List<Personel> personelListesi = new ArrayList<Personel>();
		personelListesi.add(p1);
		personelListesi.add(p2);
		personelListesi.add(p3);
		personelListesi.add(p4);
		personelListesi.add(p5);

		System.out.println(personelDAO.butunKayitlariGetir() + "\n\n");

		personelDAO.topluVeriGirisiBatch1(personelListesi);

		System.out.println(personelDAO.butunKayitlariGetir() + "\n\n");

		personelDAO.topluVeriGirsiBatch2("UPDATE personel SET soyadi='Değisti' WHERE soyadi='İlbars' ");
		System.out.println(personelDAO.butunKayitlariGetir());

		context.close();
	}

}
