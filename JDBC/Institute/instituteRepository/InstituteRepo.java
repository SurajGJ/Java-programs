package com.xworkz.institute.instituteRepository;

import java.util.List;

import com.xworkz.institute.instituteDto.InstituteDto;

public interface InstituteRepo {

	public boolean save(InstituteDto dto);

	public List<InstituteDto> read();

	public List<InstituteDto> updateLocationByIndex();

	public List<InstituteDto> updateCourseByName();

	public List<InstituteDto> deleteByRating();

	public List<InstituteDto> findByNameAndCourse();

	public List<InstituteDto> findByLocationAndRating();

	

}
