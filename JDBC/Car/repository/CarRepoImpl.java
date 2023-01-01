package com.xworkz.car.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.car.dto.CarDto;

public class CarRepoImpl implements CarRepo {

	List<CarDto> database = new ArrayList<CarDto>();

	@Override
	public boolean save(CarDto dto) {
		database.add(dto);
		System.out.println("Saved to Repository is Sucessfull");
		return true;
	}

	@Override
	public List<CarDto> read() {
		System.out.println("Your Database");
		return database;
	}

	@Override
	public List<CarDto> findByBrand(String name) {
		System.out.println("Your Search Result");
		return database;
	}

	@Override
	public boolean updateColorByIndex(String color, int index) {
		CarDto dto = database.get(index);
		dto.setColor(color);
		database.set(index, dto);
		System.out.println("Update Color by Index Sucessfull");
		return false;
	}

	@Override
	public boolean updateSpeedByBrand(String brand, int speed) {
		for (int i = 0; i < database.size(); i++) {
			CarDto dto = database.get(i);
			if (dto.getBrand().equalsIgnoreCase(brand)) {
				dto.setSpeed(speed);
				database.set(i, dto);			
			}
		}
		System.out.println("Update Speed by Brand is Sucessfull");
		return true;
	}

	@Override
	public boolean updatePriceByType(String type, double price) {
		for (int i = 0; i < database.size(); i++) {
			CarDto dto = database.get(i);
			if (dto.getType().equalsIgnoreCase(type)) {
				dto.setPrice(price);
				database.set(i, dto);			
			}
		}
		System.out.println("Update Price by Type is Sucessfull");
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		database.remove(index);
		System.out.println("Deleted the Car Dto With Respect to given Index");
		return true;
	}

	@Override
	public boolean deleteByBrandAndColor(String brand, String color) {
		Iterator<CarDto> list = database.iterator();

		while (list.hasNext()) {
			CarDto dto = list.next();
			if (dto.getBrand().equalsIgnoreCase(brand) && dto.getColor().equalsIgnoreCase(color)) {
				System.out.println("Car Dto Found");
				database.remove(dto);
				System.out.println("Deleted Car Dto with respect to given Brand and Color is Sucessfully");
				return true;
			}

		}
		return true;
	}

}
