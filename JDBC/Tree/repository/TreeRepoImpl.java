package com.xworkz.tree.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.tree.dto.TreeDto;

public class TreeRepoImpl implements TreeRepo { 
	
	String username = "root";
	String password = "Xworkzodc@123";
	String host = "jdbc:mysql://localhost:3306/Jdbc";
	
	@Override
	public boolean save(TreeDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query = "Insert into tree_info Values(?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			
			
			statement.setInt(1,dto.getSlno());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getAge());
			statement.setInt(4, dto.getHeight());
			statement.setString(5, dto.getColor());
			statement.setString(6, dto.getType());
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query = "Select * from tree_info where slno = ?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 7);
			
		    ResultSet dtos = statement.executeQuery();
			dtos.next();
			
			int slno = dtos.getInt("slno");
			String name =dtos.getString("name");
			int age = dtos.getInt("age");
			int height = dtos.getInt("height");
			String color = dtos.getString("color");
			String type = dtos.getString("type");

			System.out.println(slno+" "+name+" "+age+" "+height+" "+color+" "+type);
			
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
