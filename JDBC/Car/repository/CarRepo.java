package com.xworkz.car.repository;

import java.util.List;

import com.xworkz.car.dto.CarDto;

public interface CarRepo {

	public boolean save(CarDto dto);

	public List<CarDto> read();

	public List<CarDto> findByBrand(String name);

	public boolean updateColorByIndex(String color, int index);

	public boolean updateSpeedByBrand(String brand, int speed);

	public boolean updatePriceByType(String type, double price);

	public boolean deleteByIndex(int index);

	public boolean deleteByBrandAndColor(String brand, String color);

}
