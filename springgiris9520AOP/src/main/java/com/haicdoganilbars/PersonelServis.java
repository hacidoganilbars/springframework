package com.haicdoganilbars;

public class PersonelServis {

	private String adi, soyadi;
	private int tecrube;

	// GET-SET
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

	// Diğer METODLAR
	public void adiSoyadiKontrolEt() {
		System.out.println("PersonelServis sınıfının adiSoyadiKontrolEt() metodu");
		if (adi.length() < 2 || soyadi.length() < 2) {
			throw new IllegalArgumentException();
		}
	}

	public void selamVer(String mesaj) {
		System.out.println("PersonelService sınıfının selamVer() metodu " + "\nGELEN MESAJ " + mesaj);
	}

	public void personelBilgisiVer() {
		System.out.println("PersonelServis sınıfının personelBilgisiVer() metodu" + "\nADI SOYADI: " + adi + " "
				+ soyadi + "\nTECRÜBE: " + tecrube + " yıl");
	}

}
