package com.xworkz.bags.repository;

import com.xworkz.bags.dto.BagsDto;

public interface BagsRepo {
	
	public boolean save(BagsDto dto);
	
	public BagsDto read();
	
	public BagsDto findByName(String name);

	public BagsDto findByNameAndId(String name, int id);

}
