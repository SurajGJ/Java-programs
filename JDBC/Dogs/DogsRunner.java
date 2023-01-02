package com.xworkz.dogs;

import com.xworkz.dogs.dto.DogsDto;
import com.xworkz.dogs.srevice.DogsService;
import com.xworkz.dogs.srevice.DogsServiceImpl;

public class DogsRunner {
	
	public static void main(String[] args) {
		
		 DogsDto boxer = new DogsDto("Boxer", "Germany", 25, 30, "Medium");
		 DogsDto dane = new DogsDto("Greate Dane", "Russia", 35, 55, "Large");
		 DogsDto pitBull = new DogsDto("Pit Bull", "America", 18, 40, "Medium");
		 DogsDto sitzu = new DogsDto("Shitzu", "Austrilla", 10, 12, "Small");
		 DogsDto husky = new DogsDto("Husky", "Europe", 28, 45, "Medium");
		
		DogsService service = new DogsServiceImpl();
		service.save(boxer);
		service.save(dane);
		service.save(pitBull);
		service.save(sitzu);
		service.save(husky);
		
		System.out.println(service.findByName("HUSKY"));
		service.updateBySizeByName("Small", "Boxer");
		service.updateWeightByHeight(18, 35);
		service.deleteByOriginatedIn("russia");
		service.deleteBySize("Small");
		System.out.println(service.read());
		
	}
	
}
