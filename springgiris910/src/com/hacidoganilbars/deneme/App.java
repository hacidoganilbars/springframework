package com.hacidoganilbars.deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ISelam obj = (ISelam) applicationContext.getBean("selam");
		obj.mesajYaz("\n\nKeleci bilen kişinin yüzünü ağ ede bir söz\r\n"
				+ "Sözü pişirip diyenin işini sağ ede bir söz\r\n" + "\r\n"
				+ "Söz ola kese savaşı söz ola bitire başı\r\n" + "Söz ola ağılı aşı bal ile yağ ede bir söz\r\n"
				+ "\r\n" + "Kelecilerin pişirgil yaramazını şeşirgil\r\n"
				+ "Sözün us ile düşürgil dimegil çağ ede bir söz\r\n" + "\r\n"
				+ "Gel ahî ey şehriyâri sözümüzü dinle bâri\r\n" + "Hezâr gevher ü dinârı kara taprağ ede bir söz\r\n"
				+ "\r\n" + "Kişi bile söz demini demeye sözün kemini\r\n"
				+ "Bu cihân cehennemini sekiz uçmağ ede bir söz\r\n" + "\r\n"
				+ "Yürü yürü yolun ile gâfil olma bilin ile\r\n" + "Key sakın ki dilin ile cânına dağ ede bir söz\r\n"
				+ "\r\n" + "Yûnus imdi söz yatından söyle sözü gayetinden\r\n"
				+ "Key sakın o şeh katından seni ırağ ede bir söz\r\n" + "\r\n" + "Yunus Emre");
		
	}

}
