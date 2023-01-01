package com.xworkz.institute.instituteRepository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.institute.instituteDto.InstituteDto;

public class InstituteRepoImpl implements InstituteRepo {

	List<InstituteDto> database = new ArrayList<InstituteDto>();
	
	@Override
	public boolean save(InstituteDto dto) {
		database.add(dto);
		return true;
	}

	@Override
	public List<InstituteDto> read() {
		return database;
	}

	@Override
	public List<InstituteDto> updateLocationByIndex() {
		return database;
	}

	@Override
	public List<InstituteDto> updateCourseByName() {
		
		return database;
	}

	@Override
	public List<InstituteDto> deleteByRating() {
		
		return database;
	}
	
	@Override
	public List<InstituteDto> findByNameAndCourse() {
		return database;	
	}

	@Override
	public List<InstituteDto> findByLocationAndRating() {
		return database;
	}

}
