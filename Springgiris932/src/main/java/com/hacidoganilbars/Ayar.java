package com.hacidoganilbars;

import java.util.Properties;

public class Ayar {
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "SONUÇ : " + properties;
	}

	public void sonucuYaz() {
		System.out.println(properties.toString());
	}

}
