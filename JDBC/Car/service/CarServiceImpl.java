package com.xworkz.car.service;

import java.util.List;

import com.xworkz.car.dto.CarDto;
import com.xworkz.car.repository.CarRepo;
import com.xworkz.car.repository.CarRepoImpl;

public class CarServiceImpl implements CarService {

	CarRepo repo = new CarRepoImpl();

	@Override
	public boolean save(CarDto dto) {
		if (dto != null && dto.getBrand().length() >= 3) {
			repo.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public List<CarDto> read() {
		return repo.read();
	}

	@Override
	public CarDto findByBrand(String name) {
		if (name != null && name.length() >= 3) {
			List<CarDto> list = repo.findByBrand(name);
			for (CarDto dto : list) {
				if (dto.getBrand().equalsIgnoreCase(name)) {
					return dto;
				}
			}
		}

		return null;
	}

	@Override
	public boolean updateColorByIndex(String color, int index) {
		if (color != null && color.length() >= 2) {
			if (index >= 0 && index < 5) {
				repo.updateColorByIndex(color, index);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateSpeedByBrand(String brand, int speed) {
		if (brand != null && brand.length() >= 2) {
			if (speed >= 100 && speed < 150) {
				repo.updateSpeedByBrand(brand, speed);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updatePriceByType(String type, double price) {
		if (type != null && type.length() >= 2) {
			if (price >= 9.9 && price < 15.0) {
				repo.updatePriceByType(type, price);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		if (index >= 0) {
			repo.deleteByIndex(index);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByBrandAndColor(String brand, String color) {
		if (brand != null && brand.length() > 2) {
			if (color != null && color.length() > 3) {
				repo.deleteByBrandAndColor(brand, color);
				return true;
			}
		}
		return false;
	}

}
