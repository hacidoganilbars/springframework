package com.hacidoganilbars.enterprise;

public class Personel {

	private int id;

	private String adi;

	private String soyadi;

	private int tecrube;

	public Personel() {

	}

	public Personel(String adi, String soyadi, int tecrube) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.tecrube = tecrube;
	}

	public Personel(int id, String adi, String soyadi, int tecrube) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.tecrube = tecrube;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getTecrube() {
		return tecrube;
	}

	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}

	public String toString() {
		return "ID : " + getId() + "\nADI SOYADI : " + getAdi() + " " + getSoyadi() + "\nİŞ TECRÜBESİ : " + getTecrube()
				+ " yıl\n";
	}

}
