package com.hacidoganilbars.aop;

import java.util.List;

import com.hacidoganilbars.enterprise.Personel;

public interface IPersonelDAO {
	
	public void ekle(Personel personel);
	
	public Personel idAra(int id);
	
	public Personel adiAra(String adi);
	
	public Personel soyadiAra(String soyadi);
	
	public Personel tecrubeAra(int tecrube);
	
	public List<Personel> butunKayitlariAra();
	
	public String idDegeriyleStringBirVeriyiCekme(int id);
	
	public void topluVerisiGirisiBatch1(final List<Personel> personeller);
	
	public void topluVerisiGirisiBatch2(final String sql);

}
