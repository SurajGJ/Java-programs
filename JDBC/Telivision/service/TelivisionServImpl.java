package com.xworkz.telivision.service;

import java.util.List;

import com.xworkz.telivision.dto.TelivisionDto;
import com.xworkz.telivision.repository.TelivisionRepo;
import com.xworkz.telivision.repository.TelivisionRepoImpl;

public class TelivisionServImpl implements TelivioisonService {

	TelivisionRepo repo = new TelivisionRepoImpl();

	@Override
	public boolean save(TelivisionDto dto) {
		if (dto.getBrandName().length() >= 2 && dto.getPriceInK() > 10 && dto.getScreenSizeInInches() > 20) {
			repo.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public List<TelivisionDto> read() {

		return repo.read();
	}

	@Override
	public TelivisionDto findByNameAndSize(String name, double size) {
		if (name != null && name.length() > 2 && size > 20) {
			for (TelivisionDto dto : repo.read()) {
				if (dto.getBrandName().equalsIgnoreCase(name) && dto.getScreenSizeInInches() == size) {
					return dto;
				}
			}
		}
		System.out.println("Entered details are Invalid");
		return null;
	}

	@Override
	public TelivisionDto findTypeAndColorByIndex(String type, String color, int index) {
		if (type.length() > 2 && color.length() > 2) {
			List<TelivisionDto> list = repo.read();
			if (index >= 0 && index < list.size()) {
				TelivisionDto dto = list.get(index);
				if (dto.getColor().equalsIgnoreCase(color) && dto.getType().equalsIgnoreCase(type)) {
					return dto;
				}
			}
		}
		System.out.println("Not Found");
		return null;
	}

	@Override
	public boolean updateSizeByType(double size, String type) {
		if (size > 25) {
			if (type.equalsIgnoreCase("Lcd")) {
				List<TelivisionDto> list = repo.read();
				for (int i = 0; i < list.size(); i++) {
					TelivisionDto dto = list.get(i);
					if (dto.getType().equalsIgnoreCase(type)) {
						dto.setScreenSizeInInches(size);
						list.set(i, dto);

					}
				}
				System.out.println("Updated Size is done");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteNameAndColor(String name, String color) {
		List<TelivisionDto> list = repo.read();
		for (int i = 0; i < list.size(); i++) {
			TelivisionDto dto = list.get(i);
			if (color != null && name != null) {
				if (dto.getBrandName().equalsIgnoreCase(name) && dto.getColor().equalsIgnoreCase(color)) {
					list.remove(i);
					System.out.println("Deleted from database");
					return true;
				}
			}
		}
		return false;
	}

}
