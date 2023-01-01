package com.methods;

public class MobileRunner {

	public static void main(String[] ag) {
		Mobile mobile = new Mobile();
		
		
		mobile.brand = "Mi";
		mobile.gps = false;
		mobile.processor = "QualCom SnapDragon";
		mobile.ram = 4;
		mobile.rom = 64;
		mobile.smartphone = true;
		mobile.specs();
		
	}
}
