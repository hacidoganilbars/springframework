package com.hacidoganilbars;

public class PersonelServis {

	private String adi, soyadi;
	private int tecrube;

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

	public void adiSoyadiKontrolEt() {
		System.out.println("PersonelServis sınıfının adiSoyadiKontrolEt() metodu");
		if (adi.length() < 2 || soyadi.length() < 2) {

			throw new IllegalArgumentException();

		}
	}

	public void selamVer(String mesaj) {
		System.out.println("PersonelServis sınıfının selamVer() metodu " + "\nGELEN MESAJ: " + mesaj);
	}

	public void personelBilgisiniVer() {
		System.out.println("PersonelServis Sınıfının personelBilgisiniVer() metodu" + "\nADI SOYADI: " + adi + " "
				+ soyadi + "\nTECRUBE: " + tecrube + " yıl");
	}
}
