package com.xworkz.car;


import com.xworkz.car.dto.CarDto;
import com.xworkz.car.service.CarService;
import com.xworkz.car.service.CarServiceImpl;

public class CarRunner {


	public static void main(String[] args) {
		
		CarDto dto1 = new CarDto("Hyundai", "White", "Sedan", 120, 14.5);
		
		CarDto dto2 = new CarDto("Honda", "Greay", "Sedan", 110, 11.8);

		CarDto dto3 = new CarDto("KIA", "Black", "SUV", 140, 10.3);

		CarDto dto4 = new CarDto("TATA", "Blue", "SUV", 120, 9.7);

		CarDto dto5 = new CarDto("Toyota", "White", "Sedan", 130, 13.9);
		
		CarService service = new CarServiceImpl();
		
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		System.out.println();
		
		System.out.println(service.findByBrand("kia")) ;
		System.out.println();
		
		service.updateColorByIndex("White", 2);
		for(CarDto list : service.read()) {
			System.out.println(list);
		}
		System.out.println();
		
		service.updateSpeedByBrand("hyundai", 130);
		for(CarDto list : service.read()) {
			System.out.println(list);
		}
		System.out.println();
		
		service.updatePriceByType("sedan", 14.0);
		for(CarDto list : service.read()) {
			System.out.println(list);
		}
		System.out.println();
		
		service.deleteByIndex(1);
		for(CarDto list : service.read()) {
			System.out.println(list);
		}
		System.out.println();
		
		service.deleteByBrandAndColor("TATA", "Blue");
		for(CarDto list : service.read()) {
			System.out.println(list);
		}
	}

}
