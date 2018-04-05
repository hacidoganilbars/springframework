package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanKitap")
public class Kitap {

	@Value("Spring Frmwrk")
	private String eserAdi;
	
	@Value("54332412")
	private long eserISBN;

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}

}
