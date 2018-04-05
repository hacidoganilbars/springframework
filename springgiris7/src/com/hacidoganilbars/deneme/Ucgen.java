package com.hacidoganilbars.deneme;

public class Ucgen {
	
	private int yukseklik;
	private String cesit;
	
	
	public Ucgen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Ucgen(int yukseklik) {
		super();
		this.yukseklik = yukseklik;
	}


	public Ucgen(String cesit) {
		super();
		this.cesit = cesit;
	}


	public Ucgen(String cesit, int yukseklik) {
		super();
		this.cesit = cesit;
		this.yukseklik = yukseklik;
	}


	public Ucgen(int yukseklik, String cesit) {
		super();
		this.yukseklik = yukseklik;
		this.cesit = cesit;
	}


	public int getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	public String getCesit() {
		return cesit;
	}
	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	public void ciz() {
		System.out.println(getYukseklik()+" yüksekliğinde "+getCesit()+" Çiz");
	}
	

}
