package com.hacidoganilbars;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Takip {

	private String mesaj;

	public String getMesaj() {
		System.out.println(mesaj + "\n(B.S.N)");
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	@PostConstruct
	public void init() {
		System.out.println("init metodu");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy metodu");
	}

}
