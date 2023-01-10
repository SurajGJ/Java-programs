package com.xworkz.shoes.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shoes.SqlCredentials;
import com.xworkz.shoes.dto.ShoesDto;

public class ShoesRepoImpl implements ShoesRepo {

	@Override
	public boolean save(ShoesDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "insert into shoes_info values(?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setInt(3, dto.getSize());
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
	public ShoesDto read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "Select * from shoes_info where id = ? and brandName =?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 5);
			

			ResultSet data = statement.executeQuery();
			data.next();

			int i = data.getInt(1);
			String s = data.getString(2);
			int size = data.getInt(3);
			String co = data.getString(4);
			int p = data.getInt(5);

			System.out.println(
					"id : " + i + " Brand Name : " + s + " Size : " + size + " Color : " + co + " Price : " + p);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ShoesDto findByNameAndId(String name , int i) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "Select * from shoes_info where brandName = ? and id=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, i);

			ResultSet data = statement.executeQuery();

			while (data.next()) {
				int in = data.getInt(1);
				String s = data.getString(2);
				int size = data.getInt(3);
				String co = data.getString(4);
				int p = data.getInt(5);
				ShoesDto dto = new ShoesDto(in,s,size,co,p);
				return dto;
			}
			
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ShoesDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "Select * from shoes_info where brandName = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);

			ResultSet data = statement.executeQuery();

			while (data.next()) {
				int in = data.getInt(1);
				String s = data.getString(2);
				int size = data.getInt(3);
				String co = data.getString(4);
				int p = data.getInt(5);
				ShoesDto dto = new ShoesDto(in,s,size,co,p);
				return dto;
			}
			
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	
	

}
