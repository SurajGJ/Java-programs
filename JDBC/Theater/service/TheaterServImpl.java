package com.class_1_dec_20.service;

import com.class_1_dec_20.TheaterDTO;

public class TheaterServImpl implements TheaterServ {

	public boolean save(TheaterDTO dto) {
		if (dto != null) {
			if (dto.getName().length() >= 4) {
				System.out.println("Theater found");
				return true;
			} 
			else {
				System.out.println("Theater not found");
				return false;
			}
		} 
		else {
			System.out.println("Theater not exist");
			return false;
		}
	}

}
