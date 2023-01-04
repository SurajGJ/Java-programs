package com.xworkz.institute;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.institute.instituteDto.InstituteDto;
import com.xworkz.institute.instituteService.InstituteService;
import com.xworkz.institute.instituteService.InstituteServiceImpl;

public class Institute {
	
	public static void main(String[] args) {
		
		InstituteDto dto1 = new InstituteDto("XWorkz", "BTM", 7, 150, "Java", 5);
		
		InstituteDto dto2 = new InstituteDto("JSpider", "Basavanagudi", 10, 480, "Phython", 4);
		
		InstituteDto dto3 = new InstituteDto("QSpider", "Rajajinagara", 11, 300, "Testing", 3);
		
		InstituteDto dto4 = new InstituteDto("Kod Nest", "JP Nagara", 8, 250, "C++", 2);
		
		InstituteDto dto5 = new InstituteDto("Pentagon Space", "Jayanagara", 12, 500, "C Language", 4);
		
		InstituteDto dto6 = new InstituteDto("Carrer", "Belanddur", 10, 200, "Java", 1);
		
		
		InstituteService service = new InstituteServiceImpl();
		
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		service.save(dto6);
		
		System.out.println("---------Find by Location and Rating ----------");
		System.out.println(service.findByLoacationandRating("BTM", 5));
		
		System.out.println("---------Find by Name and Course-----------");
		System.out.println(service.findByNameAndCourse("Kod Nest", "c++"));
		
		System.out.println("---------Update by Location by index-----------");
		service.updateLocationByIndex("KR Market", 4);
		for(InstituteDto data : service.read()) {
			System.out.println(data);
		}
		
		System.out.println("----------Update Course by Name----------");
		service.updateCourseByName("Python", "carrer");
		for(InstituteDto data : service.read()) {
			System.out.println(data);
		}
		
		System.out.println("--------Deleteby Rating ----------");
		service.deleteByRating(4);
		
		for(InstituteDto data : service.read()) {
			System.out.println(data);
		}
		
	}
}
