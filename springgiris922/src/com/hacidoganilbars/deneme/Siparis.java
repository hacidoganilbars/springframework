package com.hacidoganilbars.deneme;

public class Siparis {
	
	private int tutar;

	public Siparis() {
		super();
		System.out.println("Sipariş Sınıfının Yapılandırıcısı");
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}

	public void toplamSonucuAl() {
		System.out.println("Sipariş Sınıfındaki toplamSonucuAl metodu.");
		System.out.println("Toplam: " + tutar);
	}

}
