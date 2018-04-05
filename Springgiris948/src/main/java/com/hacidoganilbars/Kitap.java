package com.hacidoganilbars;

public class Kitap {
	private String kitapAdi;
	private Long kitapISBN;

	public String kitapBilgisiAl(String yazarAdi, String yazarSoyadi, String kitapAdi, long kitapISBN) {
		this.kitapAdi = kitapAdi;
		this.kitapISBN = kitapISBN;

		return "\n\tYAZAR: " + yazarAdi + " " + yazarSoyadi + "\n\tKİTAP: " + getKitapAdi() + "\n\tISBN: "
				+ getKitapISBN();

	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public Long getKitapISBN() {
		return kitapISBN;
	}

	public void setKitapISBN(Long kitapISBN) {
		this.kitapISBN = kitapISBN;
	}

}
