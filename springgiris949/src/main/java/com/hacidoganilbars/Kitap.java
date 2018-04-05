package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanKitap")
public class Kitap {

	@Value("573432432")
	private long eserISBN;

	@Value("Spring Framework")
	private String eserAdi;

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}

	public String kitapBilisiniAl(String yazarAdi, String yazarSoyadi, String eserAdi, long eserISBN) {
		this.eserAdi = eserAdi;
		this.eserISBN = eserISBN;

		return "\n\t YAZAR: " + yazarAdi + " " + yazarSoyadi + "\n\t KİTAP: " + getEserAdi() + "\n\t ISBN: "
				+ getEserISBN() + "\n";
	}

}
