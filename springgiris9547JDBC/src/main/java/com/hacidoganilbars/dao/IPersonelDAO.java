package com.hacidoganilbars.dao;

import java.util.List;

import com.hacidoganilbars.enterprise.Personel;

public interface IPersonelDAO {

	public void createOlustur1(Personel personel);

	public void createOlustur2(Personel personel);

	public Personel readOku1(int id);

	public Personel readOku2(int id);

	public void updateGuncelle1(Personel personel, int id);

	public void updateGuncelle2(Personel personel, int id);

	public void deleteSil1(int id);

	public void deleteSil2(int id);

	public List<Personel> getAllHepsiniGetir1();

	public List<Personel> getAllHepsiniGetir2();

}
