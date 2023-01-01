package com.polymorphism.methodOveriding;

public class MobileProcessor {

	public static void main(String[] args) {

		PrimaryClockSpeed primaryClockSpeed = new PrimaryClockSpeed();
		SecondaryClockSpeed secondaryClockSpeed = new SecondaryClockSpeed();
		TertiaryClockSpeed tertiaryClockSpeed = new TertiaryClockSpeed();
		
		System.out.println("Primary clock speed of the mobile : "+primaryClockSpeed.clockSpeed()+" gHz" );
		System.out.println("Secondary clock speed of the mobile : "+secondaryClockSpeed.clockSpeed()+ " gHz" );
		System.out.println("Tertiary clock speed of the mobile : "+tertiaryClockSpeed.clockSpeed()+" gHz" );
	}

}
