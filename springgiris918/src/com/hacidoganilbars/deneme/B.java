package com.hacidoganilbars.deneme;

public class B {
	private A aNesnesi;

	public B(A aNesnesi) {
		System.out.println("B sınıfı kurucu Metodu");
		this.aNesnesi = aNesnesi;
	}

	public void goster() {
		System.out.println("B sınıfı metodu");
		aNesnesi.konsolaYaz();
	}

}
