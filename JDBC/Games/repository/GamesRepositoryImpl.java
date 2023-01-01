package com.xworkz.games.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.games.gamesDto.GamesDto;

public class GamesRepositoryImpl implements GamesRepository {

	List<GamesDto> database = new ArrayList<GamesDto>();
	GamesDto dto = new GamesDto();
	
	
	@Override
	public boolean save(GamesDto dto) {
		System.out.println("Dto is Added to Repository");
		database.add(dto);
		return true;
	}

	@Override
	public List<GamesDto> read() {
		return database;
	}

	@Override
	public List<GamesDto> findByName(String name) {
		return database;
	}

	@Override
	public boolean updateNameByIndex(String name, int num) {
		GamesDto dto = database.get(num);
		dto.setGameName(name);
		database.set(num, dto);
		System.out.println("Updated name by index is Sucessfull");
		return true;
	}

	@Override
	public boolean deleteByIndex(int num) {
		database.remove(num);
		System.out.println("Deleted data with respect to the given index");
		return false;
	}

	@Override
	public boolean updateTotalGameTimeByGameName(String name, double time) {
		System.out.println("Inside Repository");
		for (int i = 0; i < database.size(); i++) {
			GamesDto dto = database.get(i);
			System.out.println("Dto found");
			if(dto.getGameName().equalsIgnoreCase(name)) {
				dto.setTotalGameTime(time);
				database.set(i, dto);
				System.out.println("Updated Time by name Sucessfull");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletebyGameName(String name) {
		for (Iterator iterator = database.iterator(); iterator.hasNext();) {
			GamesDto gamesDto = (GamesDto) iterator.next();
			if(gamesDto.getGameName().equalsIgnoreCase(name)) {
				database.remove(gamesDto);
				System.out.println("Delete by Name Sucessfully Done");
				return true;
			}
			 
		}
		
	
		return false;
	}
	

}
