package com.hacidoganilbars.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.hacidoganilbars.dao.IPersonelDAO;
import com.hacidoganilbars.enterprise.Personel;

public class PersonelDAOImpml implements IPersonelDAO {

	private Connection connection = null;

	private DataSource dataSource;

	private String SQL = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void ekle(Personel personel) {
		SQL = "INSERT INTO personel (adi,soyadi,tecrube) VALUES(?,?,?)";
		try {
			connection = dataSource.getConnection();
			PreparedStatement statement;
			statement = connection.prepareStatement(SQL);
			statement.setString(1, personel.getAdi());
			statement.setString(2, personel.getSoyadi());
			statement.setInt(3, personel.getTecrube());
			statement.executeUpdate();
			statement.close();
			System.out.println("KAYIT BAŞARILI..");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Personel idAra(int id) {
		SQL = "SELECT * FROM personel WHERE id=?";

		try {
			connection = dataSource.getConnection();
			PreparedStatement statement;
			statement = connection.prepareStatement(SQL);
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
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Personel adiAra(String adi) {

		SQL = "SELECT *FROM personel WHERE adi=?";
		try {
			connection = dataSource.getConnection();
			PreparedStatement statement;
			statement = connection.prepareStatement(SQL);
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
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Personel soyadiAra(String soyadi) {
		SQL = "SELECT * FROM personel WHERE soyadi=?";
		try {
			connection = dataSource.getConnection();
			PreparedStatement statement = connection.prepareStatement(SQL);
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
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Personel tecrubeyiAra(int tecrube) {
		SQL = "SELECT*FROM personel WHERE tecrube=?";

		try {
			connection = dataSource.getConnection();
			PreparedStatement statement = connection.prepareStatement(SQL);
			statement.setInt(1, tecrube);
			Personel personel = null;
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}
			resultSet.close();
			statement.cancel();
			return personel;
		} catch (SQLException e) {

			throw new RuntimeException(e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
