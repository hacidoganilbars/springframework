package com.hacidoganilbars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("kaynakBean")
public class Kaynak {

	private Map<String, String> map;
	private List<String> list;
	private String eposta;

	public Kaynak() {

		eposta = "hd.ilbars@hotmail.com";

		map = new HashMap<String, String>();
		map.put("Gülşah Can", "gulsahcan@gmail.com");
		map.put("Alihan Gödeoğlu", "alihangodeoglu@facebook.com");
		map.put("Mustafa Solaklı", "solaklim@gmail.com");
		map.put("Nefise Tekeli", "ntekeli@hotmail.com");

		list = new ArrayList<String>();
		list.add("Gülşah Can");
		list.add("Alihan Gödeoğlu");
		list.add("Mustafa Solaklı");
		list.add("Nefise Tekeli");

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
