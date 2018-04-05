package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ders {
	
	private String ders;
	
	private int puan;
	
	@Autowired
	@Qualifier("ogrenciBean3")
	private Ogrenci ogrenci;

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

}
