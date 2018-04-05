package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("regExKontrolBean")
public class RegexKontrol {

	@Value("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String regEx;

	@Value("#{(kaynakBean.map['Mustafa Solaklı'] matches regExKontrolBean.regEx) == true ? 'Uygun:)' : 'Uygun Değil!!!'}")
	private String regExSonuc;

	public String getRegEx() {
		return regEx;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}

	public String getRegExSonuc() {
		return regExSonuc;
	}

	public void setRegExSonuc(String regExSonuc) {
		this.regExSonuc = regExSonuc;
	}

	@Override
	public String toString() {
		return "Girdiğiniz eposta adresi: " + regExSonuc;
	}

}
