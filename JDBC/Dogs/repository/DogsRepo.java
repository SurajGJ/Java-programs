package com.xworkz.dogs.repository;

import java.util.List;

import com.xworkz.dogs.dto.DogsDto;

public interface DogsRepo {

	public boolean save(DogsDto dto);
	
	public List<DogsDto> read();

}
