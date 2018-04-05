package com.hacidoganilbars;

public class Calisan {
	private String adi, soyadi;
	private Adres adresi;

	public Calisan() {
		System.out.println("Parametsiz Calışan Yapılandırıcı");
	}

	public Calisan(Adres adresi) {
		System.out.println("Parametreli Çalışan Yapılandırıcı");
		this.adresi = adresi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public Adres getAdresi() {
		return adresi;
	}

	public void setAdresi(Adres adresi) {
		this.adresi = adresi;
	}

	@Override
	public String toString() {
		return "ÇALIŞAN : " + getAdi() + " " + getSoyadi() + "\n" + getAdresi();
	}

}
