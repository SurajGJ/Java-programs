package com.class_1_dec_20.task.repository;

import java.util.ArrayList;
import java.util.List;

import com.class_1_dec_20.task.TrainDto;
import com.class_1_dec_20.task.service.TrainServ;
import com.class_1_dec_20.task.service.TrainServImpl;

public class TrainRepoImpl implements TrainRepo {


	 List<TrainDto> list = new ArrayList<TrainDto>();
	 
	public boolean save(TrainDto dto) {
		list.add(dto);
		System.out.println("Saved to Collection");
		return true;
	}

	public List<TrainDto> read() {
		System.out.println("Repository read method");
		return list;
	}

	public TrainDto findByName(String name) {
		System.out.println("Finding in repository");
		for(TrainDto train : list) {
			if(train.getName().equalsIgnoreCase(name)) {
				return train;
			}
		}
		System.out.println("Not Found");
		return null;
	}

	@Override
	public boolean deleteByUsingIndex(String name, int index) {
		
		return false;
	} 
	
}
