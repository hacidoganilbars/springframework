package com.hacidoganilbars.deneme;

public class C {
	public C() {
		System.out.println("C Sınıfı parametresiz Kurucu Metodu\n\n");
	}

	public C(A aNesnesi, B bNesnesi) {
		System.out.println("C sınıfının A ve B tipinde 2 Parametreli kurucu Metodu");
		aNesnesi.konsolaYaz();
		bNesnesi.goster();
		System.out.println();
	}

	public C(String mesaj, int sayi) {
		System.out.println("C sınıfının String ve int tipinde 2 parametreli kurucu metodu\n\n");
		System.out.println(mesaj + "   " + sayi);
	}

}
