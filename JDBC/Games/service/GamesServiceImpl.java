package com.xworkz.games.service;

import java.util.List;

import com.xworkz.games.gamesDto.GamesDto;
import com.xworkz.games.repository.GamesRepository;
import com.xworkz.games.repository.GamesRepositoryImpl;

public class GamesServiceImpl implements GamesService {

	GamesRepository repo = new GamesRepositoryImpl();

	@Override
	public boolean save(GamesDto dto) {
		if (dto != null && dto.getGameName().length() > 4) {
			System.out.println("Dto is Validated");
			repo.save(dto);
			return true;
		}
		System.out.println();
		return false;
	}

	@Override
	public List<GamesDto> read() {
		return repo.read();
	}

	@Override
	public GamesDto findByName(String name) {
		if (name != null && name.length() > 4) {
			List<GamesDto> dto = repo.findByName(name);
			for (GamesDto data : dto) {
				if (data.getGameName().equalsIgnoreCase(name))
					return data;
			}
		}
		System.out.println("Not Found");
		return null;
	}

	@Override
	public boolean updateNameByIndex(String name, int num) {
		if (name != null && name.length() > 4) {
			if (num >= 0) {
				repo.updateNameByIndex(name, num);
				return true;
			}
		}
		System.out.println("Enter valid Data");
		return false;
	}

	@Override
	public boolean deleteByIndex(int num) {
		if (num >= 0) {
			repo.deleteByIndex(num);
			return true;
		}

		return false;
	}

	@Override
	public boolean updateTotalGameTimeByGameName(String name, double time) {
		System.out.println("Enterting into serv method");
		if (name != null && name.length() > 4) {
			System.out.println("Name Validated");
			if (time >= 0) {
				System.out.println("Time Validated and calling repo");
				return repo.updateTotalGameTimeByGameName(name, time);
			}
		}
		return false;
	}

	@Override
	public boolean deletebyGameName(String name) {
		if(name != null && name.length() > 4) {
			System.out.println("Seraching in Repository");
			repo.deletebyGameName(name);
			return true;
		}
		return false;
	}

}
