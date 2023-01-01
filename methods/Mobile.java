package com.methods;

public class Mobile {

	String brand;
	int ram;
	int rom;
	String processor;
	boolean smartphone;
	boolean gps;
	
	public void specs() {
		
		System.out.println("Mobile details : ");
		System.out.println("Brand : " + brand);
		System.out.println("Ram : " + ram + " Gb");
		System.out.println("Rom : " + rom + " Gb");
		System.out.println("Processor : " + processor);
		
		String outcome1 = smartphone? "Yes": "No";
		System.out.println("Smartphone : "+outcome1);
		
		String outcome2 = gps? "Yes": "No";
		System.out.println("GPS : "+outcome2);
		
			
		
	}

	
}
