package com.xworkz.dogs.srevice;

import java.util.List;

import com.xworkz.dogs.dto.DogsDto;

public interface DogsService {

	public boolean save(DogsDto dto);
	
	public List<DogsDto> read();
	
	public DogsDto findByName(String name);
	
	public boolean updateWeightByHeight(double height,double weight);
	
	public boolean updateBySizeByName(String size, String name);
	
	public boolean deleteByOriginatedIn(String originated);
	
	public boolean deleteBySize(String size);
	
}
