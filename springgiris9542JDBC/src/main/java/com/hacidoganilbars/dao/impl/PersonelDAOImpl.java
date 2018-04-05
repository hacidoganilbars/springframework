package com.hacidoganilbars.dao.impl;


import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hacidoganilbars.dao.IPersoneDAO;
import com.hacidoganilbars.enterprise.Personel;

public class PersonelDAOImpl implements IPersoneDAO {

	private JdbcTemplate jdbcTemplate;
	private String SQL = null;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void ekle(Personel personel) {
		SQL = "INSERT INTO personel (adi,soyadi,tecrube) VALUES (?,?,?)";

		jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(SQL, new Object[] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube() });
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Personel idAra(int id) {
		SQL = "SELECT * FROM personel WHERE id=?";
		jdbcTemplate = new JdbcTemplate(dataSource);

		Personel personel = (Personel)jdbcTemplate.queryForObject(SQL, new Object[] { id },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel adiAra(String adi) {
		SQL = "SELECT * FROM personel WHERE adi=?";
		jdbcTemplate = new JdbcTemplate(dataSource);

		Personel personel = (Personel)jdbcTemplate.queryForObject(SQL, new Object[] { adi },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel soyadiAra(String soyadi) {
		SQL = "SELECT * FROM personel WHERE soyadi=?";
		jdbcTemplate = new JdbcTemplate(dataSource);

		Personel personel = (Personel)jdbcTemplate.queryForObject(SQL, new Object[] { soyadi },
				new BeanPropertyRowMapper(Personel.class));

		return personel;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Personel tecrubeyiAra(int tecrube) {
		SQL = "SELECT * FROM personel WHERE tecrube=?";
		jdbcTemplate = new JdbcTemplate(dataSource);

		Personel personel =(Personel) jdbcTemplate.queryForObject(SQL, new Object[] { tecrube },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

}
