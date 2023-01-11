package com.xworkz.soap.repository;

import java.util.List;

import com.xworkz.soap.dto.SoapsDto;

public interface SoapsRepo {
	
	public boolean save(SoapsDto dto);
	
	public List<SoapsDto> read();
	
	public SoapsDto findByNameAndPrice(String name, int price);
	
	public boolean updateNamebyPrice(String name, int price);
	
	public boolean updateColorAndFragranceByName(String color, String fra, String name);

	public boolean updateTypeById(String type, int id);
}
