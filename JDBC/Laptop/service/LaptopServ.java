package com.class_1_dec_20.task_2_laptop.service;

import java.util.List;

import com.class_1_dec_20.task_2_laptop.LaptopDto;

public interface LaptopServ {
	
	public boolean save(LaptopDto dto);
	public List<LaptopDto> read(String password);
	public LaptopDto findByName(String name);
	LaptopDto deleteByIndex(int index);
	LaptopDto updateNameByIndex(String name, int index);
}
