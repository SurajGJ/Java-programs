package com.xworkz.mobile;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class MobileRunner {

  
	public static void main(String[] args) {
		
		MobileService service = new MobileServiceImpl();
		
		MobileDto mi = new MobileDto("Mi", "4g", "IPS LCD", 1080, true, 6, 64, true, 5000, 16, 32, "MediaTec", 14999);
		
		MobileDto realme = new MobileDto("Realme", "4g", "AM-OLED", 1440, true, 8, 128, true, 5000, 16, 64, "Snapdragon", 16999);
		
		MobileDto onePlus = new MobileDto("One+", "5g", "AM_OLED", 2160, true, 8, 256, false, 4500, 32, 50, "Snapdragon", 35990);

		MobileDto nokia = new MobileDto("Nokia", "3g", "IPS LCD", 360, false, 2, 32, true, 2500, 5, 8, "MediaTec", 5990);

		MobileDto vivo = new MobileDto("Vivo", "4g", "IPS LCD", 1080, true, 6, 128, true, 5000, 16, 50, "MediaTec", 17990);
		
		MobileDto oppo = new MobileDto("Oppo", "5g", "AM_OLED", 1440, true, 8, 128, true, 5000, 32, 108, "Snapdragon", 20990);


		service.save(mi);
		service.save(realme);
		service.save(onePlus);
		service.save(nokia);
		service.save(vivo);
		service.save(oppo);
		System.out.println(".......______Save method finished............._____");
		
		List<MobileDto> list = new ArrayList<MobileDto>();
		
		List<MobileDto> data = service.read();
		for(MobileDto dto : data) {
			System.out.println(dto);
		}
		
		System.out.println(".......______ Read method finished............._____");
		
		System.out.println(service.findByName("Realme"));
		
		System.out.println(".......______ Find method finished............._____");
		
		service.deleteByIndex(3);
		for(MobileDto dto : data) {
			System.out.println(dto);
		}
		
		System.out.println(".......______ Delete method finished............._____");
		
		service.updateNameByIndex(2, "OnePlus");

	}
}