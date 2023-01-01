package com.descion_making.ifelse;

public class RemainderUsibngTernaryOperator {

	public static void main(String[] args) {

		int number = -21;
		System.out.println("The entered number is : "+number);
		
		String output = (number % 2 == 0)? "Even Number" : "ODD Number";
		
		System.out.println(output);
	}

}
