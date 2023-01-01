package com.class_1_dec_20.repository;

import java.util.ArrayList;
import java.util.List;
import com.class_1_dec_20.TheaterDTO;

public class TheaterRepoImpl implements TheaterRepo {

	List<TheaterDTO> list = new ArrayList<TheaterDTO>();
 
	public boolean save(TheaterDTO dto) {
		System.out.println("Saved Sucessfully");
		return true;
	}

}
