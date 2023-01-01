package com.xworkz.games;


import java.util.ArrayList;
import java.util.List;

import com.xworkz.games.gamesDto.GamesDto;
import com.xworkz.games.service.GamesService;
import com.xworkz.games.service.GamesServiceImpl;

public class GamesRunner {

	public static void main(String[] args) {
		
		GamesDto dto = new GamesDto();
		
		GamesDto kabaddi = new GamesDto("Kabbaddi", 7, 40.00, true, "Pradeep Narwal");
		
		GamesDto t20Cricket = new GamesDto("Cricket", 11, 220.00, false, "Abraham Benjemin DeVillers");

		GamesDto footBall = new GamesDto("Football", 11, 95.00, false, "Ronaldo");
		
		GamesDto hockey = new GamesDto("Hockey", 11, 60.00, false, "Dhyan Chand");
		
		GamesDto badminton = new GamesDto("Shettle Coock", 2, 45.00, true, "P.V. Sindhu");
		
		GamesService service = new GamesServiceImpl();
		
		service.save(kabaddi);
		service.save(t20Cricket);
		service.save(footBall);
		service.save(hockey);
		service.save(badminton);
		
		List<GamesDto> database = new ArrayList<GamesDto>();
		System.out.println("------------Read method ---------");
		for(GamesDto data  : service.read()) {
			System.out.println(data);
		}
		
		System.out.println("---------Find by name method -----------");
		
		System.out.println(service.findByName("cricket"));
		
		System.out.println("--------Update by Index method----------");
		
		service.updateNameByIndex("Badminton", 4);
		
		System.out.println("----------Find by name----------");
		
		System.out.println(service.findByName("Badminton"));
		
		
		System.out.println("--------------Update by name----------");
 		System.out.println(service.updateTotalGameTimeByGameName("Badminton", 50.00));
 		
		for(GamesDto data  : service.read()) {
			System.out.println(data);
		}
		
		System.out.println("--------------Delete by index----------");
		
		service.deleteByIndex(3);
		for(GamesDto data  : service.read()) {
			System.out.println(data);
		}
		
		System.out.println("--------------Delete by Name----------");
		
		service.deletebyGameName("kabbaddi");
		for(GamesDto data  : service.read()) {
			System.out.println(data);
		}
	}
}
