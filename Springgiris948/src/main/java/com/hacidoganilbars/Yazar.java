package com.hacidoganilbars;

public class Yazar {

	private String adi;
	private String soyadi;
	private String eserAdi;
	private Kitap kitap;
	private String bilgi;

	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
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

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

}
