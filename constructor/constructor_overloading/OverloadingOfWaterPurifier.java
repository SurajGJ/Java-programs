package com.constructor.constructor_overloading;

public class OverloadingOfWaterPurifier {

	public static void main(String[] hkjol) {
		
		WaterPurifier purifier = new WaterPurifier();
		purifier.calling();
		
		purifier = new WaterPurifier("Havells","KS73GK10H",6);
		purifier.calling();
		
		purifier = new WaterPurifier("Havells","KS73GK10H",6,2,14.59);
		purifier.calling();
	}
}
