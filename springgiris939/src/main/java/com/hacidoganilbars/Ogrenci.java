package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Required;

public class Ogrenci {
	private String adi;
	private String soyadi;
	private Integer yasi;

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

	public int getYasi() {
		return yasi;
	}

	@Required
	public void setYasi(int yasi) {
		this.yasi = yasi;
	}

}
