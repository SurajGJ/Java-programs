package com.xworkz.watch.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.utils.DButils;

public class WatchRepoImpl implements WatchRepo {

	@Override
	public boolean saveAll(WatchDto dto) {

		String query = "Insert into watch_info values(?,?,?,?,?)";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {
			state.setInt(1, dto.getId());
			state.setString(2, dto.getBrandName());
			state.setString(3, dto.getColor());
			state.setString(4, dto.getType());
			state.setInt(5, dto.getPrice());

			state.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<WatchDto> readAll() {

		String query = "Select * from watch_info";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {
			ResultSet result = state.executeQuery();

			List<WatchDto> database = new ArrayList<WatchDto>();

			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				String color = result.getString(3);
				String type = result.getString(4);
				int price = result.getInt(5);

				WatchDto dto = new WatchDto(id, name, color, type, price);
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
	public List<WatchDto> findByNameAndColor(String name, String color) {

		String query = "Select * from watch_info where brandName = ? and color = ?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {
			state.setString(1, name);
			state.setString(2, color);

			ResultSet result = state.executeQuery();

			List<WatchDto> database = new ArrayList<WatchDto>();

			while (result.next()) {
				int id = result.getInt(1);
				String name1 = result.getString(2);
				String color1 = result.getString(3);
				String type = result.getString(4);
				int price = result.getInt(5);

				WatchDto dto = new WatchDto(id, name1, color1, type, price);
				database.add(dto);
			}
			return database;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("hello");
		return null;

	}

	@Override
	public WatchDto findByIdAndType(int id, String type) {

		String query = "Select * from watch_info where id = ? and type = ?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {
			state.setInt(1, id);
			state.setString(2, type);

			ResultSet result = state.executeQuery();

			result.next();
			int id1 = result.getInt(1);
			String name = result.getString(2);
			String color = result.getString(3);
			String type1 = result.getString(4);
			int price = result.getInt(5);

			WatchDto dto = new WatchDto(id1, name, color, type1, price);
			return dto;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("hello");
		return null;

	}

	@Override
	public boolean updateNameById(String name, int id) {

		String query = "Update watch_info set brandNAme =? where id = ?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {
			state.setInt(2, id);
			state.setString(1, name);

			state.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteByColorAndType(String color, String type) {
		String query = "Delete from watch_info where color = ? and type = ?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement state = connection.prepareStatement(query);) {
			state.setString(2, type);
			state.setString(1, color);

			state.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
