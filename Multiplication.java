package com.programs;

public class Multiplication {
	int number=200;
	int power=1;
	int multiply;
	int base=5;
	
	int call(int exponent) {
		for(int i=1; i<=exponent; i++) {
			power=power*base;
		}
		multiply= power*number;
		System.out.println("multiply ("+number+") == "+multiply);
		return multiply;
	}
	public static void main(String[] args) {

		Multiplication cross = new Multiplication();
		
		if( cross.number > 0 ) {
			if(cross.number < 10) {
				cross.call(1);
			}
			else if(cross.number >= 10 && cross.number <= 50) {
				cross.call(2);
			}
			else{
				cross.call(3);
			}	
		}	
	}

}
