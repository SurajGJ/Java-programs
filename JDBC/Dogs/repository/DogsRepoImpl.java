package com.xworkz.dogs.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dogs.dto.DogsDto;

public class DogsRepoImpl implements DogsRepo {

	List<DogsDto> database = new ArrayList<DogsDto>();
	
	@Override
	public boolean save(DogsDto dto) {
		database.add(dto);
		return true;
	}

	@Override
	public List<DogsDto> read() {
		return database;
	}

}
