package com.xworkz.soap.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.soap.constants.MySqlCredentials;
import com.xworkz.soap.dto.SoapsDto;

public class SoapsRepoImpl implements SoapsRepo {

	@Override
	public boolean save(SoapsDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MySqlCredentials.URL.getValue(),
					MySqlCredentials.USERNAME.getValue(), MySqlCredentials.PASSWORD.getValue());

			String query = "Insert into soaps_info values(?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getFragrance());
			statement.setInt(5, dto.getWeightInGrams());
			statement.setString(6, dto.getManufacturedate());
			statement.setString(7, dto.getType());
			statement.setInt(8, dto.getPrice());

			statement.executeUpdate();

			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public List<SoapsDto> read() {
		List<SoapsDto> database = new ArrayList<SoapsDto>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MySqlCredentials.URL.getValue(),
					MySqlCredentials.USERNAME.getValue(), MySqlCredentials.PASSWORD.getValue());

			String query = "Select * from soaps_info";

			PreparedStatement statement = connection.prepareStatement(query);

			ResultSet data = statement.executeQuery();

			while (data.next()) {
				int id = data.getInt(1);
				String name = data.getString(2);
				String colour = data.getString(3);
				String fragrance = data.getString(4);
				int weightInGrams = data.getInt(5);
				String manufacturedate = data.getString(6);
				String type = data.getString(7);
				int price = data.getInt(8);

				SoapsDto dto = new SoapsDto(id, name, colour, fragrance, weightInGrams, manufacturedate, type, price);
				database.add(dto);
			}
			statement.close();
			connection.close();

			return database;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapsDto findByNameAndPrice(String name, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MySqlCredentials.URL.getValue(),
					MySqlCredentials.USERNAME.getValue(), MySqlCredentials.PASSWORD.getValue());

			String query = "Select * from soaps_info where name = ? and price = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, price);

			ResultSet data = statement.executeQuery();

			data.next();
			int id = data.getInt(1);
			String name1 = data.getString(2);
			String colour = data.getString(3);
			String fragrance = data.getString(4);
			int weightInGrams = data.getInt(5);
			String manufacturedate = data.getString(6);
			String type = data.getString(7);
			int price1 = data.getInt(8);

			SoapsDto dto = new SoapsDto(id, name1, colour, fragrance, weightInGrams, manufacturedate, type, price1);

			statement.close();
			connection.close();
			return dto;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateNamebyPrice(String name, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MySqlCredentials.URL.getValue(),
					MySqlCredentials.USERNAME.getValue(), MySqlCredentials.PASSWORD.getValue());

			String query = "update soaps_info set name = ? where price = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, price);

			statement.executeUpdate();
			statement.close();
			connection.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateColorAndFragranceByName(String color, String fra, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MySqlCredentials.URL.getValue(),
					MySqlCredentials.USERNAME.getValue(), MySqlCredentials.PASSWORD.getValue());

			String query = "update soaps_info set color = ? , fragrance = ? where name = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, color);
			statement.setString(2, fra);
			statement.setString(3, name);

			statement.executeUpdate();
			statement.close();
			connection.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateTypeById(String type, int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MySqlCredentials.URL.getValue(),
					MySqlCredentials.USERNAME.getValue(), MySqlCredentials.PASSWORD.getValue());

			String query = "update soaps_info set type = ? where id = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, type);
			statement.setInt(2, id);

			statement.executeUpdate();
			statement.close();
			connection.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
