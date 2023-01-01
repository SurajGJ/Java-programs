package com.class_1_dec_20.task.service;

import java.util.List;

import com.class_1_dec_20.task.TrainDto;

public interface TrainServ {
		
	public boolean save(TrainDto dto);
	public List<TrainDto> read();
	public TrainDto findByName(String name);
	public boolean deleteByUsingIndex(String name, int index);

}
