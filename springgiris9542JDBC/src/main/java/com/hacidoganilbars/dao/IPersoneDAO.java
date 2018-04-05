package com.hacidoganilbars.dao;

import com.hacidoganilbars.enterprise.Personel;

public interface IPersoneDAO {

	public void ekle(Personel personel);

	public Personel idAra(int id);

	public Personel adiAra(String adi);

	public Personel soyadiAra(String soyadi);

	public Personel tecrubeyiAra(int tecrube);

}
