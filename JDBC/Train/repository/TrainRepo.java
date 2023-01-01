package com.class_1_dec_20.task.repository;

import java.util.List;

import com.class_1_dec_20.task.TrainDto;

public interface TrainRepo {

	public boolean save(TrainDto dto);

	public List<TrainDto> read();

	public TrainDto findByName(String name);

	public boolean deleteByUsingIndex(String name, int index);

}
