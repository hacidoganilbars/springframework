package com.hacidoganilbars.deneme;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Ogrenci {

	List<?> ogrenciList;
	Set<?> ogrenciSet;
	Map<?, ?> ogrenciMap;
	Properties ogrenciProperties;

	public List<?> getOgrenciList() {
		System.out.println("List Elemanları: " + ogrenciList);
		return ogrenciList;
	}

	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}

	public Set<?> getOgrenciSet() {
		System.out.println("Set Elemanları: " + ogrenciSet);
		return ogrenciSet;
	}

	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}

	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map Elemanları: " + ogrenciMap);
		return ogrenciMap;
	}

	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}

	public Properties getOgrenciProperties() {
		System.out.println("Properties Elemanları: " + ogrenciProperties);
		return ogrenciProperties;
	}

	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	}

}
