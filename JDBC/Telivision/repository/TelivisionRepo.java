package com.xworkz.telivision.repository;

import java.util.List;

import com.xworkz.telivision.dto.TelivisionDto;

public interface TelivisionRepo {

	public boolean save(TelivisionDto dto);
	
	public List<TelivisionDto> read();

}
