package com.hacidoganilbars;

public class Adres {

	private String tamAdresi;

	public String getTamAdresi() {
		return tamAdresi;
	}

	public void setTamAdresi(String tamAdresi) {
		this.tamAdresi = tamAdresi;
	}

	@Override
	public String toString() {
		return "TAM ADRESİ : " + getTamAdresi();
	}

}
