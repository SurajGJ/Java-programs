package com.xworkz.watch;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class WatchRunner {

	public static void main(String[] args) {

		WatchDto dto2 = new WatchDto(2, "Titan", "White", "Wrist Watch", 2596);
		WatchDto dto3 = new WatchDto(3, "Sonata", "Black", "Wall Clock", 8500);
		WatchDto dto4 = new WatchDto(4, "Titan", "White", "Wall Watch", 2596);
		WatchDto dto5 = new WatchDto(5, "Maxima", "Yellow", "Sports Watch", 8566);
		WatchDto dto6 = new WatchDto(6, "Gshock", "Grey", "Wrist Watch", 2596);
		WatchDto dto7 = new WatchDto(7, "Hubolt", "Silver", "Wrist Watch", 10999);
		WatchDto dto8 = new WatchDto(8, "Ajanta", "Meroon", "Pendulum Clock", 15999);
		WatchDto dto9 = new WatchDto(9, "HMT", "White", "Wall Clock", 2596);
		WatchDto dto10 = new WatchDto(10, "Gshock", "Grey", "Sports Watch", 8900);

		WatchDto[] list = { dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10 };

		WatchService service = new WatchServiceImpl();

		for (int i = 0; i < list.length; i++) {
			service.saveAll(list[i]);
		}

		for (WatchDto dto : service.readAll()) {
			System.out.println(dto);
		}

		for (WatchDto dto : service.findByNameAndColor("Gshock", "grey")) {
			System.out.println(dto);
		}

		System.out.println(service.findByIdAndType(7, "Wrist Watch"));

		service.updateNameById("Delton", 2);

		service.deleteByColorAndType("Grey", "Wrist Watch");
	}

}
