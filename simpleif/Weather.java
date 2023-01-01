package com.descion_making.simpleif;

public class Weather {

	public static void main (String[] args) {
		int weather = 17;
		
		if(weather < 17 || weather > 26)
			System.out.println("Bad Temprature");
		
		if(weather <= 26 && weather >=17)
			System.out.println("Good Temprature ");
		
		
	}
	
}
