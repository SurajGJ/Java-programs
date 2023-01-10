package com.xworkz.bags.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.bags.SqlCredentials;
import com.xworkz.bags.dto.BagsDto;

public class BagsRepoImpl implements BagsRepo {

	@Override
	public boolean save(BagsDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "Insert Into bags_info values(?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getCapcity());
			statement.setString(4, dto.getColor());
			statement.setInt(5, dto.getPrice());

			statement.executeUpdate();

			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public BagsDto read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "Select * from bags_info";

			PreparedStatement statement = connection.prepareStatement(query);

			ResultSet data = statement.executeQuery();
			while (data.next()) {
				int id = data.getInt(1);
				String name = data.getString(2);
				int capcity = data.getInt(3);
				String color = data.getString(4);
				int price = data.getInt(5);
				BagsDto dto = new BagsDto(name, id, color, price, capcity);
				System.out.println(dto);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public BagsDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "Select * from bags_info where name = ?";

			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, name);

			ResultSet data = statement.executeQuery();
			while (data.next()) {
				int id = data.getInt(1);
				String name1 = data.getString(2);
				int capcity = data.getInt(3);
				String color = data.getString(4);
				int price = data.getInt(5);
				BagsDto dto = new BagsDto(name1, id, color, price, capcity);
				System.out.println(dto);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BagsDto findByNameAndId(String name, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "Select * from bags_info where name = ? and id = ?";

			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, name);
			statement.setInt(2, id);

			ResultSet data = statement.executeQuery();
			while (data.next()) {
				int id1 = data.getInt(1);
				String name1 = data.getString(2);
				int capcity = data.getInt(3);
				String color = data.getString(4);
				int price = data.getInt(5);
				BagsDto dto = new BagsDto(name1, id1, color, price, capcity);
				System.out.println(dto);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
