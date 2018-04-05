package com.hacidoganilbars.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class PersonelDAOImpl implements IPersonelDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createOlustur1(Personel personel) {

		String SQL = "INSERT INTO personel (adi,soyadi,tecrube) VALUES(?,?,?)";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, personel.getAdi());
			preparedStatement.setString(2, personel.getSoyadi());
			preparedStatement.setInt(3, personel.getTecrube());

			int durum = preparedStatement.executeUpdate();

			if (durum != 0) {
				System.out.println("id değeri " + personel.getId() + " olan kayıt eklendi.\n");
			} else {
				System.err.println("id değeri " + personel.getId() + "olan kayıt eklenemedi!!!\n");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public void createOlustur2(Personel personel) {

		String SQL = "INSERT INTO personel (adi,soyadi,tecrube) VALUES (?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube() };


		int durum = jdbcTemplate.update(SQL, args);

		if (durum != 0) {
			System.out.println("id değeri " + personel.getId() + " olan kayıt eklendi.\n");
		} else {
			System.err.println("id değeri " + personel.getId() + " olan kayıt eklenemedi!!!\n");
		}

	}

	@Override
	public Personel readOku1(int id) {
		String SQL = "SELECT * FROM personel WHERE id=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Personel personel = null;

		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				personel = new Personel();
				// personel.setId(resultSet.getInt("id"));
				personel.setAdi(resultSet.getString("adi"));
				personel.setSoyadi(resultSet.getString("soyadi"));
				personel.setTecrube(resultSet.getInt("tecrube"));
				System.out.println("ID : " + resultSet.getInt("id") + " - ADI SOYADI : " + resultSet.getString("adi")
						+ " " + resultSet.getString("soyadi") + " - İŞ TECRÜBESİ : " + resultSet.getInt("tecrube")
						+ " yıl\n");

			} else {
				System.err.println("id değeri " + id + " olan kayıt bulunamadı!!!\n");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personel;
	}

	@Override
	public Personel readOku2(int id) {
		String SQL = "SELECT * FROM personel WHERE id=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		try {
			Personel personel = jdbcTemplate.queryForObject(SQL, new Object[] { id }, new RowMapper<Personel>() {

				@Override
				public Personel mapRow(ResultSet resultSet, int rowNum) throws SQLException {
					Personel personel = new Personel();
					personel.setId(resultSet.getInt("id"));
					personel.setAdi(resultSet.getString("adi"));
					personel.setSoyadi(resultSet.getString("soyadi"));
					personel.setTecrube(resultSet.getInt("tecrube"));

					System.out.println("ID : " + resultSet.getInt("id") + " - ADI SOYADI : "
							+ resultSet.getString("adi") + " " + resultSet.getString("soyadi") + " - İŞ TECRÜBESİ : "
							+ resultSet.getInt("tecrube") + " yıl\n");
					return personel;
				}
			});

			return personel;

		} catch (Exception e) {
			System.out.println("null\n");
			return null;
		}

	}

	@Override
	public void updateGuncelle1(Personel personel, int id) {
		String SQL = "UPDATE FROM personel SET adi=?,soyadi=?,tecrube=? WHERE id=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, personel.getAdi());
			preparedStatement.setString(2, personel.getSoyadi());
			preparedStatement.setInt(3, personel.getTecrube());
			preparedStatement.setInt(4, id);

			System.out.println("ID : " + id + " - ADI SOYADI : " + personel.getAdi() + " " + personel.getSoyadi()
					+ " - İŞ TECRÜBESİ : " + personel.getTecrube() + " yıl\n");
			int durum = preparedStatement.executeUpdate();
			if (durum != 0) {
				System.out.println("id değeri " + id + " olan kayıt güncellendi..\n");
			} else {
				System.err.println("id değeri " + id + " olan kayıt güncellenemedi!!!\n");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void updateGuncelle2(Personel personel, int id) {
		String SQL = "UPDATE FROM personel SET adi=?, soyadi=?, tecrube=? WHERE id=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube(), id };

		int durum = jdbcTemplate.update(SQL, args);
		if (durum != 0) {
			System.out.println("id değeri " + id + " olan kayıt güncellendi..\n");
		} else {
			System.err.println("id değeri " + id + " olan kayıt güncellenemedi!!!\n");
		}
	}

	@Override
	public void deleteSil1(int id) {
		String SQL = "DELETE FROM personel WHERE id=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, id);
			int durum = preparedStatement.executeUpdate();
			if (durum != 0) {
				System.out.println("id değeri " + id + " olan kayıt silindi..\n");
			} else {
				System.err.println("id değeri " + id + " olan kayıt silinemedi!!!\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void deleteSil2(int id) {
		String SQL = "DELETE FROM personel WHERE id=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		int durum = jdbcTemplate.update(SQL, id);
		if (durum != 0) {
			System.out.println("id değeri " + id + " olan kayıt silindi..\n");
		} else {
			System.err.println("id değeri " + id + " olan kayıt silinemedi!!!\n");
		}

	}

	@Override
	public List<Personel> getAllHepsiniGetir1() {
		String SQL = "SELECT * FROM personel";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Personel personel = null;
		List<Personel> personelListesi = new ArrayList<Personel>();
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(SQL);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				personel = new Personel();
				personel.setId(resultSet.getInt("id"));
				personel.setAdi(resultSet.getString("adi"));
				personel.setSoyadi(resultSet.getString("soyadi"));
				personel.setTecrube(resultSet.getInt("tecrube"));
				personelListesi.add(personel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personelListesi;
	}

	@Override
	public List<Personel> getAllHepsiniGetir2() {
		String SQL = "SELECT * FROM personel";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Personel> personelListesi = new ArrayList<Personel>();
		List<Map<String, Object>> personelKayitlar = jdbcTemplate.queryForList(SQL);
		Personel personel = null;
		for (Map<String, Object> personelKayit : personelKayitlar) {
			personel = new Personel();
			personel.setId(Integer.parseInt(String.valueOf(personelKayit.get("id"))));
			personel.setAdi(String.valueOf(personelKayit.get("adi")));
			personel.setSoyadi(String.valueOf(personelKayit.get("soyadi")));
			personel.setTecrube(Integer.parseInt(String.valueOf(personelKayit.get("tecrube"))));
			personelListesi.add(personel);

		}
		return personelListesi;
	}

}
