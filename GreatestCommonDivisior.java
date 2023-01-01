package com.programs;
import java.util.Scanner;

public class GreatestCommonDivisior {

	public static void main(String[] fgh) {
		System.out.println("Enter two number");
		Scanner scr = new Scanner(System.in);
		int number1 = scr.nextInt();
		int number2 = scr.nextInt();
		int gcd=0;
		for (int i=1 ; i <= number1 && i <= number2; i++) {
			if( number1  % i == 0 && number2 % i == 0)
				gcd=i;
		}
		System.out.println("greatest Common Divisior of "+number1 +" and "+number2+" : "+gcd);
	}
}
