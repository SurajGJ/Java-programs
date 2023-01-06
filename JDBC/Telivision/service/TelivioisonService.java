package com.xworkz.telivision.service;

import java.util.List;

import com.xworkz.telivision.dto.TelivisionDto;

public interface TelivioisonService {

	public boolean save(TelivisionDto dto);
	
	public List<TelivisionDto> read();
	
	public TelivisionDto findByNameAndSize(String name, double size);
	
	public TelivisionDto findTypeAndColorByIndex(String type, String color, int index);
	
	public boolean updateSizeByType(double size, String type);
	
	public boolean deleteNameAndColor(String name, String color);
}
