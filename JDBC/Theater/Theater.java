package com.class_1_dec_20;

import com.class_1_dec_20.repository.TheaterRepo;
import com.class_1_dec_20.repository.TheaterRepoImpl;
import com.class_1_dec_20.service.TheaterServ;
import com.class_1_dec_20.service.TheaterServImpl;

public class Theater {

	public static void main(String[] age) {
		
		TheaterDTO dto =  new TheaterDTO(1,"PVR", "Jp Nagar", 4);
		
		TheaterServ serv = new TheaterServImpl();
		serv.save(dto);
		
		TheaterRepo repo = new TheaterRepoImpl();
		repo.save(dto);
	}
}
