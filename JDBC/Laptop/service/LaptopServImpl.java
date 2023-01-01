package com.class_1_dec_20.task_2_laptop.service;

import java.util.ArrayList;
import java.util.List;

import com.class_1_dec_20.task_2_laptop.LaptopDto;
import com.class_1_dec_20.task_2_laptop.repository.LaptopRepo;
import com.class_1_dec_20.task_2_laptop.repository.LaptopRepoImpl;

public class LaptopServImpl implements LaptopServ {

	LaptopRepo repo = new LaptopRepoImpl();

	List<LaptopDto> database = new ArrayList<LaptopDto>();

	@Override
	public boolean save(LaptopDto dto) {
		if (dto  != null && dto.getBrandName().length() > 1) {
			System.out.println("validation completed");
			repo.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public List<LaptopDto> read(String password) {
		if (password != null && password.equals("Correct@1")) {
			System.out.println("Password is validated");
			return repo.read();
		}
		System.out.println("Invalid Password");
		return null;
	}

	@Override
	public LaptopDto findByName(String name) {
		if (name != null && name.length() > 1) {
			System.out.println("Laptop Foud");
			return repo.findByName(name);
		}
		System.out.println("Laptop not Found");
		return null;
	}

	@Override
	public LaptopDto deleteByIndex(int index) {
		System.out.println("Dto is in service and sending to repository to delete the data");
		repo.deleteByIndex(index);
		return null;
	}
	
	@Override
	public LaptopDto updateNameByIndex(String name, int index) {
		if(name!=null && name.length()>=1) {
			System.out.println("DTO transfered to repository for next step");
		}
		return repo.updateNameByIndex(name,index);
	}

}
