package com.hacidoganilbars.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class PersonelDAOImpl implements IPersonelDAO {

	private Connection baglanti = null;

	private String sqlKodu = null;

	private DataSource veriKaynagi;

	public void setVeriKaynagi(DataSource veriKaynagi) {

		this.veriKaynagi = veriKaynagi;

	}

	@Override
	public void ekle(Personel personel) {
		sqlKodu = "INSERT INTO personel (adi,soyadi,tecrube) VALUES (?,?,?)";

		try {

			baglanti = veriKaynagi.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);
			preparedStatement.setString(1, personel.getAdi());
			preparedStatement.setString(2, personel.getSoyadi());
			preparedStatement.setInt(3, personel.getTecrube());
			preparedStatement.executeUpdate();
			preparedStatement.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Personel idAra(int id) {
		sqlKodu = "SELECT * FROM personel WHERE id = ?";
		try {

			baglanti = veriKaynagi.getConnection();
			PreparedStatement statement;
			statement = baglanti.prepareStatement(sqlKodu);
			statement.setInt(1, id);
			Personel personel = null;
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {

				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}
			resultSet.close();
			statement.close();
			return personel;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Personel adiAra(String adi) {
		sqlKodu = "SELECT * FROM personel WHERE adi=?";

		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement statement;
			statement = baglanti.prepareStatement(sqlKodu);
			statement.setString(1, adi);
			Personel personel = null;
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));

			}
			resultSet.close();
			statement.close();
			return personel;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Personel soyadiAra(String soyadi) {
		sqlKodu = "SELECT * FROM personel WHERE soyadi=?";

		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement statement;
			statement = baglanti.prepareStatement(sqlKodu);
			statement.setString(1, soyadi);
			Personel personel = null;
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}
			resultSet.close();
			statement.close();
			return personel;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Personel tecrubeyiAra(int tecrube) {
		sqlKodu = "SELECT * FROM personel WHERE tecrube=?";
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement statement;
			statement = baglanti.prepareStatement(sqlKodu);
			statement.setInt(1, tecrube);
			Personel personel = null;
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}
			resultSet.close();
			statement.close();
			return personel;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
