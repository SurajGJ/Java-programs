package com.xworkz.mobile.repository;

import java.util.List;

import com.xworkz.mobile.dto.MobileDto;

public interface MobileRepo {

	public boolean save(MobileDto dto);

	public List<MobileDto> read();

	public boolean updateNameByIndex(int index, String name);

	public MobileDto findByName(String name);

	public boolean deleteByIndex(int index);

}
