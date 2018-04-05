package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Selam obj1 = (Selam) context.getBean("selam");

		obj1.setMesaj("\r\n" + "\r\n" + "Ağla gözüm ağla, gülmezem ayruk\r\n" + "Gönül dosta gider, gelmezem ayruk\r\n"
				+ "\r\n" + "Ne gam bunda bana, bin gez ölürsem\r\n" + "Anda ölüm olmaz, ölmezem ayruk\r\n" + "\r\n"
				+ "Yansın canım, yansın aşkın oduna\r\n" + "Aksın kanlı yaşım aksın, silmezem ayruk\r\n" + "\r\n"
				+ "Göyündüm aşk ile, ta kül olunca\r\n" + "Boyandım rengine, solmazam ayruk\r\n" + "\r\n"
				+ "Beni irşat eden mürşid-i kamil\r\n" + "Yeter, bir el almazam ayruk\r\n" + "\r\n"
				+ "Varlığım yokluğa denişmişem ben,\r\n" + "Bugün, cana, başa kalmazam ayruk\r\n" + "\r\n"
				+ "Fenadan bekaya göç eyler olduk\r\n" + "Yüneldim şol yola, dönmezem ayruk\r\n" + "\r\n"
				+ "Muhabbet bahrinin gavvası oldum,\r\n" + "Gerekmez, Ceyhuna dalmazam ayruk\r\n" + "\r\n"
				+ "Dilerim fazlından ayırmayasın\r\n" + "Hocam, senden özge sevmezem ayruk\r\n" + "\r\n"
				+ "Söyler aşık dilinden bunları Yunus\r\n" + "Eğer aşık isem, ölmezem ayruk\r\n" + "Yunus Emre ");

		obj1.goster();
//		Selam obj2=(Selam) context.getBean("selam");
//		obj2.setMesaj("ilbars ilbars ilbars");
//		obj2.goster();
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
