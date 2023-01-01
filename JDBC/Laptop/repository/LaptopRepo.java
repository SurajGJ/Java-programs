package com.class_1_dec_20.task_2_laptop.repository;

import java.util.List;

import com.class_1_dec_20.task_2_laptop.LaptopDto;

public interface LaptopRepo {

	public boolean save(LaptopDto dto);

	public List<LaptopDto> read();

	public LaptopDto findByName(String name);

	public LaptopDto deleteByIndex(int index);

	public LaptopDto updateNameByIndex(String name, int index); 
	
}
