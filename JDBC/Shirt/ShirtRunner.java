package com.xworkz.shirt;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.repository.ShirtRepo;
import com.xworkz.shirt.repository.ShirtRepoImpl;

public class ShirtRunner {

	public static void main(String[] args) {
		
		ShirtDto dto2 = new ShirtDto(2, "Peter England", "Brown", 32, false);
		ShirtDto dto3 = new ShirtDto(3, "Adidas", "Green", 29, true);
		ShirtDto dto4 = new ShirtDto(4, "Rebook", "Red", 48, false);
		ShirtDto dto5 = new ShirtDto(5, "Levi's", "Yellow", 36, true);
		ShirtDto dto6 = new ShirtDto(6, "Jack & Jones", "Black", 42, true);

		ShirtRepo repo = new ShirtRepoImpl();
		
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
		
		List<ShirtDto> list = repo.read();
		for(ShirtDto dto : list) {
//			System.out.println(dto);
		}
		
//		System.out.println(repo.findByNameAndId("Rebook", 4));
		
		
//		repo.updatesizeByName(59, "Adidas");
//		repo.deleteByColor("Black");
		
		repo.deleteBySizeAndName(36, "Levi's");
	}

}
