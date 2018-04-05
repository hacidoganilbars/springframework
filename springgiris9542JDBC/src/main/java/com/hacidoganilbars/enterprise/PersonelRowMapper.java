package com.hacidoganilbars.enterprise;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonelRowMapper implements RowMapper<Personel> {

	@Override
	public Personel mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Personel personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
				resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
		
		return personel;
	}

}
