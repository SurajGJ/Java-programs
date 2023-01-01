package com.xworkz.games.repository;

import java.util.List;

import com.xworkz.games.gamesDto.GamesDto;

public interface GamesRepository {

	public boolean save(GamesDto dto);

	public List<GamesDto> read();

	public List<GamesDto> findByName(String name);

	public boolean updateNameByIndex(String name, int num);

	public boolean deleteByIndex(int num);

	public boolean updateTotalGameTimeByGameName(String name, double time);

	public boolean deletebyGameName(String name);
	
	

}
