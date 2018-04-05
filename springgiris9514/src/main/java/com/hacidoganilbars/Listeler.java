package com.hacidoganilbars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ListelerBean")
public class Listeler {

	@Value("#{kaynakBean.map['Hibernate']}")
	private String mapElemani;

	@Value("#{kaynakBean.list[1]}")
	private String listElemani;

	public String getMapElemani() {
		return mapElemani;
	}

	public void setMapElemani(String mapElemani) {
		this.mapElemani = mapElemani;
	}

	public String getListElemani() {
		return listElemani;
	}

	public void setListElemani(String listElemani) {
		this.listElemani = listElemani;
	}

	@Override
	public String toString() {
		return "seçilen mapElemani=" + mapElemani + "\nSeçilen listElemani=" + listElemani;
	}

}
