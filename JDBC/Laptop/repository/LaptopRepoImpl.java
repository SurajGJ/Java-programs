package com.class_1_dec_20.task_2_laptop.repository;

import java.util.ArrayList;
import java.util.List;

import com.class_1_dec_20.task_2_laptop.LaptopDto;

public class LaptopRepoImpl implements LaptopRepo{

	List<LaptopDto> database = new ArrayList<LaptopDto>();
	@Override
	public boolean save(LaptopDto dto) {
		database.add(dto);
		System.out.println("Saved to Collection");
		return true;
	}
	@Override
	public List<LaptopDto> read() {
		System.out.println("Lists...");
		return database;
	}
	@Override
	public LaptopDto findByName(String name) {
		for(LaptopDto laptop : database) { 
			if(laptop.getBrandName().equals(name)) {
			System.out.println("R   esult");
			return laptop;
			}
		}
		return null;
		
	}
	@Override
	public LaptopDto deleteByIndex(int index) {
		database.remove(index);
		System.out.println("Data is deleted");
		return null;
	}

	@Override
	public LaptopDto updateNameByIndex(String name, int index) {
		database.get(index);
		LaptopDto dto=new LaptopDto();
		dto.setBrandName(name);
		database.set(index, dto);
		database.add(dto);
		return null;
	}
	
	

}
