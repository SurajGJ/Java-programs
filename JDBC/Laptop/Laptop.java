package com.class_1_dec_20.task_2_laptop;

import java.util.ArrayList;
import java.util.List;

import com.class_1_dec_20.task_2_laptop.service.LaptopServ;
import com.class_1_dec_20.task_2_laptop.service.LaptopServImpl;

public class Laptop {

	private String brandName;
	private String color;
	private String model;
	private String processorName;
	private int ramCapacity;
	private int romCapacity;
	private boolean extenRam;
	private boolean ectendRom;
	private float displaySize;
	private boolean isFingerPrintUnlock;
	private boolean backliteKeyboard;
	private boolean touchScreen;
	private float maxClockSpeed;
	private String suitablefor;
	private boolean graphicCardAvilable;
	private int price;

	public static void main(String[] args) {
		List<LaptopDto> database = new ArrayList<LaptopDto>();
		LaptopServ serv = new LaptopServImpl();

		LaptopDto laptop1 = new LaptopDto("Lenovo", "Greay", "KA94JS8J", "AMD Ryzen 5", 8, 512, true, true, 15.4f,
				false, true, false, 4.1f, "Allrounder Laptop", false, 4599);
		LaptopDto laptop2 = new LaptopDto("Hp", "Black", "AJUJ98BIE9", "iNTEL i5", 8, 512, true, true, 14f, true, true,
				false, 3.8f, "Office and Student", false, 51999);
		LaptopDto laptop3 = new LaptopDto("Hp", "Black", "AJUJ98BIE9", "iNTEL i5", 8, 512, true, true, 14f, true, true,
				false, 3.8f, "Office and Student", false, 51999);

		serv.save(laptop1);
		serv.save(laptop2);
		serv.save(laptop3);

		database.add(laptop1);
		database.add(laptop2);
		database.add(laptop3);

		//List<LaptopDto> s1 = serv.read("Correct@1");
		for (LaptopDto list : serv.read("Correct@1")) {
			System.out.println(list);
		}
		
		System.out.println();
		
		serv.findByName("Lenovo");
		serv.updateNameByIndex("Asus", 2);
		serv.deleteByIndex(1);
		
		System.out.println();
		
		for (LaptopDto list : serv.read("Correct@1")) {
			System.out.println(list);
		}
	
	}

}
