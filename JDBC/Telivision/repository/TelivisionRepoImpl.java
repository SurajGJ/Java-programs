package com.xworkz.telivision.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.telivision.dto.TelivisionDto;

public class TelivisionRepoImpl implements TelivisionRepo {

	List<TelivisionDto> database = new ArrayList<TelivisionDto>();
	
	@Override
	public boolean save(TelivisionDto dto) {
		database.add(dto);
		System.out.println("Saved to Database");
		return true;
	}

	@Override
	public List<TelivisionDto> read() {
		return database;
	}

}
