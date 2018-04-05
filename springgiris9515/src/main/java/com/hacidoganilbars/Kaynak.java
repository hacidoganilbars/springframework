package com.hacidoganilbars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kaynak {

	private Map<String, String> map;

	private List<String> list;

	private String eposta;

	public Kaynak() {
		eposta = "hd.ilbars@hotmail.com";

		map = new HashMap<String, String>();
		map.put("Hamza Fatih Sevim", "hamzafatihsevim@gmail.com");
		map.put("Mustafa Gökkoyun", "mustafagokkoyun@facebook.com");
		map.put("Hakan Ceylan", "hakanceylan@yahoo.com");
		map.put("Mustafa Ergan", "mustafaergan@hotmail.com");
		map.put("Seçkin İlbars", "seckinilbars@gmail.com");

		list = new ArrayList<String>();
		list.add("Hamza Fatih Sevim");
		list.add("Mustafa Gökkoyun");
		list.add("Hakan Ceylan");
		list.add("Mustafa Ergan");
		list.add("Seçkin İlbars");

	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

}
