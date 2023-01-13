package com.xworkz.shirt.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.util.DButils;

public class ShirtRepoImpl implements ShirtRepo {

	@Override
	public boolean save(ShirtDto dto) {

		String query = "Insert into shirt_info values(?,?,?,?,?)";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {

			state.setInt(1, dto.getId());
			state.setString(2, dto.getName());
			state.setString(3, dto.getColor());
			state.setInt(4, dto.getSize());
			state.setBoolean(5, dto.isHasPacket());

			state.executeUpdate();
			System.out.println("Saved to dtabase");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<ShirtDto> read() {

		String query = "Select * from shirt_info";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query)) {

			ResultSet data = state.executeQuery();

			List<ShirtDto> database = new ArrayList<ShirtDto>();

			while (data.next()) {
				int id = data.getInt(1);
				String name = data.getString(2);
				String color = data.getString(3);
				int size = data.getInt(4);
				boolean hasPacket = data.getBoolean(5);

				ShirtDto dto = new ShirtDto(id, name, color, size, hasPacket);
				database.add(dto);
			}
			return database;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ShirtDto findByNameAndId(String name, int id) {

		String query = "Select * from shirt_info where name= ? and id =?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query)) {
			
			state.setString(1, name);
			state.setInt(2, id);
			
			ResultSet data = state.executeQuery();

			data.next();
			int id1 = data.getInt(1);
			String name1 = data.getString(2);
			String color = data.getString(3);
			int size = data.getInt(4);
			boolean hasPacket = data.getBoolean(5);

			ShirtDto dto = new ShirtDto(id1, name1, color, size, hasPacket);
			return dto;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	@Override
	public boolean updatesizeByName(int size, String name) {
		
		String query = "Update shirt_info set size=? where name=?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {

			state.setInt(1, size);
			state.setString(2, name);
			

			state.executeUpdate();
			System.out.println("updated done");
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	
	@Override
	public boolean deleteByColor(String color) {
		String query = "Delete from shirt_info where color =  ?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {

			
			state.setString(1, color);
			
			state.executeUpdate();
			
			System.out.println("Delete done");
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	
	@Override
	public boolean deleteBySizeAndName(int size, String name) {
		String query = "Delete from shirt_info where size = ? and name = ?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {

			state.setInt(1,size);
			state.setString(2, name);
			
			state.executeUpdate();
			
			System.out.println("Delete done");
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	
}
