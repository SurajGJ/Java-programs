package com.xworkz.games.service;

import java.util.List;

import com.xworkz.games.gamesDto.GamesDto;

public interface GamesService {

	public boolean save(GamesDto dto);
	
	public List<GamesDto> read();
	
	public GamesDto findByName(String name);
	
	public boolean updateNameByIndex(String name, int num);
	
	public boolean deleteByIndex(int num);
	
	public boolean updateTotalGameTimeByGameName(String name, double time);
	
	public boolean deletebyGameName(String name);
	
}
