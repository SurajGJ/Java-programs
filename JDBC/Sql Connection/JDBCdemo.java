package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCdemo {

	public static void main(String[] args) {
		
		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/Jdbc";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query = "INSERT INTO animals VALUES(?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 5);
			statement.setString(2, "Cow");
			statement.setInt(3, 70);
			statement.setInt(4, 40);
			statement.setInt(5, 15);
			
//			statement.setInt(1, 4);
//			statement.setString(2, "Dog");
//			statement.setInt(3, 26);
//			statement.setInt(4, 23);
//			statement.setInt(5, 10);
//			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
