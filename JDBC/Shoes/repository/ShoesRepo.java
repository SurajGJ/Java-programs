package com.xworkz.shoes.repository;

import com.xworkz.shoes.dto.ShoesDto;

public interface ShoesRepo {

	public boolean save(ShoesDto dto);
	
	public ShoesDto read();
	
	public ShoesDto findByNameAndId(String name, int i);
	
	public ShoesDto findByName(String name);
	
	
}
