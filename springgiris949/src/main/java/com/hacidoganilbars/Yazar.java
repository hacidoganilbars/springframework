package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanYazar")
public class Yazar {

	@Value("Mimar")
	private String adi;

	@Value("Aslan")
	private String soyAdi;

	@Value("#{beanKitap}")
	private Kitap kitap;

	@Value("#{beanKitap.eserAdi}")
	private String kitapAdi;

	@Value("#{beanKitap.kitapBilgisiniAl('Mimar','Aslan','Hibernate','6644432321')}")
	private String bilgi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyAdi() {
		return soyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}

}
