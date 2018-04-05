package com.hacidoganilbars.impl;

import com.hacidoganilbars.IPersonelServis;

public class PersonelServisImpl implements IPersonelServis {

	private String adi;

	private String soyadi;

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

	@Override
	public void adiSoyadiKontrolEt() {
		System.out.println("PersonelServisImpl sınıfının adiSoyadiKontrolEt() metodu");
		if (adi.length() < 2 || soyadi.length() < 2) {

			throw new IllegalArgumentException();

		}

	}

	@Override
	public String selamVer(String mesaj) {
		System.out.println("PersonelServisImpl sınıfının selamVer(..) metodu.\nGELEN MESAJ: " + mesaj);
		return mesaj;
	}

	@Override
	public void personelBilgisiniAl() {
		System.out.println("PersonelServisImpl sınıfının personelBilgisiniAl() metodu.\nADI SOYADI: " + adi + " "
				+ soyadi + "\nTECRUBE: " + tecrube + " yıl");

	}

}
