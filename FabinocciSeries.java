package com.basicPrograms;

import java.util.Scanner;

public class FabinocciSeries {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Number");
			int number1 = scr.nextInt();
			int number2 = scr.nextInt();
			int total = 10;
			System.out.print(number1+" "+number2+" ");
			int number;
			for ( int i = 1; i<=total; i++) {
				System.out.print((number = number1+number2) +" ");
				number1 = number2;
				number2 = number;	
			}			
		}
	}
}
