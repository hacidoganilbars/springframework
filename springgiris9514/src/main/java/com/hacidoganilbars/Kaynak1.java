package com.hacidoganilbars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("kaynakBean")
public class Kaynak1 {

	private Map<String, String> map;

	private List<String> list;


	public Kaynak1() {
		map = new HashMap<String, String>();
		map.put("Hibernate", "Hakan Ceylan");
		map.put("Spring", "Hacı Doğan İlbars");
		map.put("Primefaces", "Mustafa Gökkoyun");
		map.put("Android", "Hamza Fatih Sevim");

		list = new ArrayList<String>();
		list.add("Sinem Toprak");
		list.add("Zeynep Gün");
		list.add("Gülşah Can");
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

}
