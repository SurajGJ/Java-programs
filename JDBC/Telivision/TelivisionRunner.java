package com.xworkz.telivision;

import com.xworkz.telivision.dto.TelivisionDto;
import com.xworkz.telivision.service.TelivioisonService;
import com.xworkz.telivision.service.TelivisionServImpl;

public class TelivisionRunner {

	public static void main(String[] args) {
		
		TelivisionDto dto1 = new TelivisionDto("Onida","h8",10.5,20.8, "CRT", "Greay");
		TelivisionDto dto2 = new TelivisionDto("MI","horizon",24.9,43.8, "LCD", "Black");
		TelivisionDto dto3 = new TelivisionDto("OnePlus","10R",27.2,43.8, "LCD", "Black");
		TelivisionDto dto4 = new TelivisionDto("Sony","s11",45.7,68, "LED", "Black");
		TelivisionDto dto5 = new TelivisionDto("BPL","yr6",11.5,22.8, "CRT", "Greay");
		
		TelivioisonService service = new TelivisionServImpl();
		
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		System.out.println();
		
		System.out.println(service.findByNameAndSize("oneplus", 43.8));
		System.out.println();
		
		System.out.println(service.findTypeAndColorByIndex("lcd", "black", 1));
		System.out.println();
		
		
		service.updateSizeByType(43.0, "Lcd");
		for(TelivisionDto dto : service.read()) {
			System.out.println(dto);
		}
		System.out.println();
		
		
		service.deleteNameAndColor("onePlus", "black");
		System.out.println();
		for(TelivisionDto dto : service.read()) {
			System.out.println(dto);
		}
	}

}
