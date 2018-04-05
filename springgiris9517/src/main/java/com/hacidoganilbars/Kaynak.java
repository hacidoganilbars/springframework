
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
		map.put("Hakan Ceylan", "hceylan.34@hotmail.com");
		map.put("Adnan İlbars", "adnan_ilbars@hotmail.com");
		map.put("Erhan Kundakçı", "kundakci-erhan@facebook.com");
		map.put("Özlem Koçak", "kocak.80.ozlem@facebook.com.tr");
		map.put("Ahmet Coşkun", "ahmetçoşkun@gmail.com");

		list = new ArrayList<String>();
		list.add("Hakan Ceylan");
		list.add("Adnan İlbars");
		list.add("Erhan Kundakçı");
		list.add("Özlem Koçak");
		list.add("Ahmet Coşkun");
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
