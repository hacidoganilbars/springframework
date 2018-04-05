package com.hacidoganilbars.matematik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("beanHesapMakinesiComponent")
public class HesapMakinesi {

	private Islem islem;

	public Islem getIslem() {
		return islem;
	}

	@Autowired
	public void setIslem(Islem islem) {
		this.islem = islem;
	}

	public void sonuclariGetir(int sayi1, int sayi2) {

		System.out.println("TOPLAMI: " + islem.topla(sayi1, sayi2));
		System.out.println("FARKI: " + islem.cikarma(sayi1, sayi2));
		System.out.println("ÇARPIMI: " + islem.carp(sayi1, sayi2));
		System.out.println("BÖLÜMÜ: " + islem.bol(sayi1, sayi2));

	}

}
