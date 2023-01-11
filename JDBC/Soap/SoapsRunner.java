package com.xworkz.soap;

import java.util.List;

import com.xworkz.soap.dto.SoapsDto;
import com.xworkz.soap.repository.SoapsRepo;
import com.xworkz.soap.repository.SoapsRepoImpl;

public class SoapsRunner {

	public static void main(String[] args) {
		
		SoapsDto dto2 = new SoapsDto(2, "Kitokem", "Brown", "Sandal", 35, "10/01", "Pets", 55);
		SoapsDto dto3 = new SoapsDto(3, "Dove", "White", "Milk", 25, "30/04", "Humans", 30);
		SoapsDto dto4 = new SoapsDto(4, "Vim", "Green", "Lemon", 15, "10/08", "Cleaning", 5);
		SoapsDto dto5 = new SoapsDto(5, "Wheel", "green", "Jasmine", 50, "20/04", "Cleaning", 45);
		SoapsDto dto6 = new SoapsDto(6, "Lux", "Gold", "Lotus", 35, "17/09", "Humans", 40);
		SoapsDto dto7 = new SoapsDto(7, "Patanjali", "Brown", "Sandal", 30, "09/07", "Humans", 15);
		SoapsDto dto8 = new SoapsDto(8, "PetAg", "White", "Lilly", 30, "10/01", "Pets", 40);
		SoapsDto dto9 = new SoapsDto(9, "Himalaya", "Dark Green", "Neem", 35, "10/10", "Humans", 45);
		SoapsDto dto10 = new SoapsDto(10, "No1", "Cream", "Hibiscus", 55, "30/11", "Humans", 40);

		SoapsRepo repo = new SoapsRepoImpl();
		
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);
//		repo.save(dto10);

		
		for(SoapsDto list : repo.read()) {
			System.out.println(list);
		}
		
		System.out.println(repo.findByNameAndPrice("Lux", 40 ));
		repo.updateNamebyPrice("Santoor", 20);
		
		repo.updateColorAndFragranceByName("White", "Sun Flower", "PetAg");
		repo.updateTypeById("Cleaning", 1);
		
		repo.deleteByName("Santoor");
	}

}
