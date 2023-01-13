package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchService {

	public boolean saveAll(WatchDto dto);

	public List<WatchDto> readAll();

	public List<WatchDto> findByNameAndColor(String name, String color);

	public WatchDto findByIdAndType(int id, String type);

	public boolean updateNameById(String name, int id);

	public boolean deleteByColorAndType(String color, String type);

}
