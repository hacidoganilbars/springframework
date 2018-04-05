package com.hacidoganilbars.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class PersonelDAOImpl implements IPersonelDAO {

	private DataSource dataSource = null;

	private JdbcTemplate jdbcTemplate = null;

	private String SQL = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void ekle(Personel personel) {
		SQL = "INSERT INTO personel (adi,soyadi,tecrube) VALUES (?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(SQL, new Object[] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube() });
		System.out.println("KAYIT BAŞARILI..");

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel idAra(int id) {
		SQL = "SELECT * FROM personel WHERE id=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = jdbcTemplate.queryForObject(SQL, new Object[] { id },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel adiAra(String adi) {
		SQL = "SELECT * FROM personel WHERE adi=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = jdbcTemplate.queryForObject(SQL, new Object[] { adi },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel soyadiAra(String soyadi) {
		SQL = "SELECT * FROM personel WHERE soyadi=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = jdbcTemplate.queryForObject(SQL, new Object[] { soyadi },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel tecrubeAra(int tecrube) {
		SQL = "SELECT * FROM personel WHERE tecrube=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Personel personel = jdbcTemplate.queryForObject(SQL, new Object[] { tecrube },
				new BeanPropertyRowMapper(Personel.class));
		return personel;
	}

	@Override
	public List<Personel> butunKayitlariGetir() {
		SQL = "SELECT * FROM personel";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Personel> personelListesi = new ArrayList<Personel>();

		List<Map<String, Object>> satirlar = jdbcTemplate.queryForList(SQL);
		Personel personel;
		for (Map<String, Object> satir : satirlar) {
			personel = new Personel();
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
		String sonuc = jdbcTemplate.queryForObject(SQL, new Object[] { id }, String.class);
		return sonuc;
	}

	@Override
	public void topluVeriGirisiBatch1(final List<Personel> personelListesi) {
		SQL = "INSERT INTO personel (adi,soyadi,tecrube) VALUES (?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.batchUpdate(SQL, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
				Personel personel = personelListesi.get(i);
				preparedStatement.setString(1, personel.getAdi());
				preparedStatement.setString(2, personel.getSoyadi());
				preparedStatement.setInt(3, personel.getTecrube());

			}

			@Override
			public int getBatchSize() {
				return personelListesi.size();
			}
		});

	}

	@Override
	public void topluVeriGirsiBatch2(final String sql) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.batchUpdate(new String[] { sql });
	}

}
