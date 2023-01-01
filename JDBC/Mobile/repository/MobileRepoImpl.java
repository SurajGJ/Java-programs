package com.xworkz.mobile.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	List<MobileDto> database = new ArrayList<MobileDto>();
	MobileDto dto = new MobileDto();

	@Override
	public boolean save(MobileDto dto) {
		database.add(dto);
		System.out.println("Added to Repository");
		return true;
	}

	@Override
	public List<MobileDto> read() {
		System.out.println("Displaying all records in Repository");
		return database;
	}

	@Override
	public boolean updateNameByIndex(int index, String name) {
		database.get(index);
		System.out.println("Getting database by index to Update");
		dto.setName(name);
		database.set(index, dto);
		System.out.println("Updated Sucessfully");
		return true;
	}

	@Override
	public MobileDto findByName(String name) {
		for (MobileDto search : database) {
			if (search.getName().equalsIgnoreCase(name)) {
				System.out.println("Dto Found");
				return search;
			}
		}

		System.out.println("Not Found...");
		return null;
	}
 
	@Override
	public boolean deleteByIndex(int index) {
		database.remove(index);
		System.out.println("Data Deleted Sucessfully");

		return true;
	}

}
