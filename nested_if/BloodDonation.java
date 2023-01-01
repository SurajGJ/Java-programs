package com.descion_making.nested_if;

public class BloodDonation {

	public static void main(String[] args) {

		float weight = 59.3709f;
		int age =-22;
		
		if (age >= 18 ) {
			if ( weight > 50 ) {
				System.out.println("You can Donate Blood and save others Life");
			}
			else
				System.out.println("Increase your Weight to Donate Blood");
		}
		else
			System.out.println("Your age is less than 18");
	}

}
