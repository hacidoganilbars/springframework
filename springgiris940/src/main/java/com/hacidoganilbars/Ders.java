package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Autowired;


//kullanılan yöntemlerin hepsi aynı işi yapar sınıfları birbirine bağlar.
public class Ders {

	@Autowired
	private Ogrenci ogrenci;

	private int puan;
	private String ders;
	
//	//@Autowired
//	public Ders(Ogrenci ogrenci) {
//		this.ogrenci=ogrenci;
//	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	//@Autowired
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

}
