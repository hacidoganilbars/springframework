package com.hacidoganilbars.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class PersonelDAOImpl implements IPersonelDAO {

	private String SQL = null;

	private JdbcTemplate jdbcTemplate;

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void ekle(Personel personel) {
		SQL = "INSERT INTO personel (adi,soyadi,tecrube) VALUES (?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(SQL, new Object[] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube() });
		System.out.println("KAYITLAR BAŞARIYLA YÜKLENDİ..");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel idAra(int id) {
		SQL = "SELECT * FROM personel WHERE id=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = (Personel) jdbcTemplate.queryForObject(SQL, new Object[] { id },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel adiAra(String adi) {
		SQL = "SELECT * FROM personel WHERE adi=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = (Personel) jdbcTemplate.queryForObject(SQL, new Object[] { adi },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel soyadiAra(String soyadi) {
		SQL = "SELECT * FROM personel WHERE soyadi=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = (Personel) jdbcTemplate.queryForObject(SQL, new Object[] { soyadi },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel tecrubeAra(int tecrube) {
		SQL = "SELECT * FROM personel WHERE tecrube=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = (Personel) jdbcTemplate.queryForObject(SQL, new Object[] { tecrube },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@Override
	public List<Personel> butunkayitlarAra() {
		SQL = "SELECT * FROM personel";
		jdbcTemplate = new JdbcTemplate(dataSource);

		List<Map<String, Object>> satirlar = jdbcTemplate.queryForList(SQL);
		List<Personel> personelListesi = new ArrayList<Personel>();

		for (Map<String, Object> satir : satirlar) {
			Personel personel = new Personel();
			personel.setId(Integer.parseInt(String.valueOf(satir.get("id"))));
			personel.setAdi((String) satir.get("adi"));
			personel.setSoyadi((String) satir.get("soyadi"));
			personel.setTecrube(Integer.parseInt(String.valueOf(satir.get("tecrube"))));
			personelListesi.add(personel);
		}
		return personelListesi;
	}

	@Override
	public String idDegeriyleStringVeriCekme(int id) {
		SQL = "SELECT soyadi FROM personel WHERE id=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sonuc = (String) jdbcTemplate.queryForObject(SQL, new Object[] { id }, String.class);
		return sonuc;
	}

}
