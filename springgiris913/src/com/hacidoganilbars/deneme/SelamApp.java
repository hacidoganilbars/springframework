package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Selam obj1 = (Selam) context.getBean("selam");
		obj1.setMesaj("\r\n" + "\r\n" + "İlim ilim bilmektir\r\n" + "İlim kendin bilmektir\r\n"
				+ "Sen kendin bilmezsin\r\n" + "Ya nice okumaktır\r\n" + "\r\n" + "Okumaktan murat ne\r\n"
				+ "Kişi Hak'kı bilmektir\r\n" + "Çün okudun bilmezsin\r\n" + "Ha bir kuru ekmektir\r\n" + "\r\n"
				+ "Okudum bildim deme\r\n" + "Çok taat kıldım deme\r\n" + "Eğer Hak bilmez isen\r\n"
				+ "Abes yere gelmektir\r\n" + "\r\n" + "Dört kitabın mânâsı\r\n" + "Bellidir bir elifte\r\n"
				+ "Sen elifi bilmezsin\r\n" + "Bu nice okumaktır\r\n" + "\r\n" + "Yiğirmi dokuz hece\r\n"
				+ "Okursun uçtan uca\r\n" + "Sen elif dersin hoca\r\n" + "Mânâsı ne demektir\r\n" + "\r\n"
				+ "Yunus Emre der hoca\r\n" + "Gerekse bin var hacca\r\n" + "Hepisinden iyice\r\n"
				+ "Bir gönüle girmektir\r\n" + "Yunus Emre ");
		// System.out.println(obj1.getMesaj());
		obj1.goster();

		Selam obj2 = (Selam) context.getBean("selam");
		obj2.goster();
	}

}
