package com.xworkz.bags;

import com.xworkz.bags.dto.BagsDto;
import com.xworkz.bags.repository.BagsRepo;
import com.xworkz.bags.repository.BagsRepoImpl;

public class BagsRunner {

	public static void main(String[] args) {
		
		BagsRepo repo = new BagsRepoImpl();
		
		BagsDto dto1 = new BagsDto("Wildcraft", 1, "Black", 10, 999);
		BagsDto dto2 = new BagsDto("Puma", 2, "White",8, 899);
		BagsDto dto3 = new BagsDto("Sky Bags", 3, "Brown", 13, 1699);
		BagsDto dto4 = new BagsDto("Gear", 4, "Red", 10, 1099);
		BagsDto dto5 = new BagsDto("Skyline", 5, "Yellow", 18, 2599);
		
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
		
		repo.read();
		
		repo.findByName("Puma");
		
		repo.findByNameAndId("Gear",4);
		
	}

}
