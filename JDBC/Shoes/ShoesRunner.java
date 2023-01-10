package com.xworkz.shoes;

import com.xworkz.shoes.dto.ShoesDto;
import com.xworkz.shoes.repository.ShoesRepo;
import com.xworkz.shoes.repository.ShoesRepoImpl;

public class ShoesRunner {

	public static void main(String[] args) {

		ShoesRepo repo = new ShoesRepoImpl();
		
		ShoesDto dto2 = new ShoesDto(2,"Nike", 8, "White", 1299);
		ShoesDto dto3 = new ShoesDto(3,"Rebook", 9, "Brown", 1599);
		ShoesDto dto4 = new ShoesDto(4,"Puma", 6, "Greay", 999);
		ShoesDto dto5 = new ShoesDto(5,"Bata", 9, "Yellow", 899);
		
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
		
		//repo.read();
//		System.out.println(repo.findByNameAndId("Nike" , 2));
		
		System.out.println(repo.findByName("Bata"));
		

	}

}
