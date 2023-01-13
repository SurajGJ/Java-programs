package com.xworkz.shirt.repository;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;

public interface ShirtRepo {

	public boolean save(ShirtDto dto);
	
	public List<ShirtDto> read();
	
	public ShirtDto findByNameAndId(String name, int id);
	
	public boolean updatesizeByName(int size,String name);
	
	public boolean deleteByColor(String color);
	
	public boolean deleteBySizeAndName(int size,String name);
	
}
