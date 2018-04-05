package com.hacidoganilbars.deneme;

public class B {

	private A aNesnesi;

	public B(A aNesnesi) {
		System.out.println("B Sınıfının kurucu metodu");
		this.aNesnesi = aNesnesi;
	}

	public void sonucuGoster() {
		System.out.println("B Sınıfına ait normal metod");
		aNesnesi.konsolaYaz();
	}

}
