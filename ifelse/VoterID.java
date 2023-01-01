package com.descion_making.ifelse;

public class VoterID {
	
	public static void main(String[] args) {
		int age = 17;
		System.out.println("Your age is : "+age);
		
		if ( age >= 18 )
			System.out.println("You are eligible for Voting");
		else 
			System.out.println("Your are still miner, not eligible for voting");
	}
}
