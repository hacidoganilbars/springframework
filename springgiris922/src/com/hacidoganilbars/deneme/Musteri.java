package com.hacidoganilbars.deneme;

public class Musteri {

	private Siparis siparis;

	public Musteri() {
		super();
		System.out.println("Müşteri Sınıfının Yapılandırıcısı");
	}

	public Siparis getSiparis() {
		System.out.println("Müşteri sınıfındaki getSiparis metodu.");
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		System.out.println("Müşteri sınıfındaki setSiparis metodu.");
		this.siparis = siparis;
	}

	public void hesapOde() {
		System.out.println("Müşteri Sınıfındaki hesapOde metodu.");
		siparis.toplamSonucuAl();
	}

}
