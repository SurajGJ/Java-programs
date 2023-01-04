package com.xworkz.institute.instituteService;

import java.util.List;

import com.xworkz.institute.instituteDto.InstituteDto;

public interface InstituteService {

	public boolean save(InstituteDto dto);
	
	public List<InstituteDto> read();
	
	public boolean updateLocationByIndex(String location, int index);
	
	public boolean updateCourseByName(String course, String name);
	
	public boolean deleteByRating(int rating);
	
	public InstituteDto findByNameAndCourse(String name, String course);
	
	public InstituteDto findByLoacationandRating(String location, int rating);
}
