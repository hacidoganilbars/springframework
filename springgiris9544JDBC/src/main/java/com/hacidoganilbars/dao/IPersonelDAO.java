package com.hacidoganilbars.dao;

import java.util.List;

import com.hacidoganilbars.enterprise.Personel;

public interface IPersonelDAO {

	public void ekle(Personel personel);

	public Personel idAra(int id);

	public Personel adiAra(String adi);

	public Personel soyadiAra(String soyadi);

	public Personel tecrubeAra(int tecrube);

	public List<Personel> butunkayitlarAra();

	public String idDegeriyleStringVeriCekme(int id);
}
