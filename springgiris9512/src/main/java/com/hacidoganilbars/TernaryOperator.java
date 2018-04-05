package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanTernaryOperator")
public class TernaryOperator {

	@Value("#{beanSayilar.sayi1 lt beanSayilar.sayi4 ? true : false}")
	private boolean kontrol;

	public boolean isKontrol() {
		return kontrol;
	}

	public void setKontrol(boolean kontrol) {
		this.kontrol = kontrol;
	}

	@Override
	public String toString() {
		return "TernaryOperator kontrol sonucu: " + kontrol;
	}

}
