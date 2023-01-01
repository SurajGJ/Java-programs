package com.basicPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] art) {
		Scanner scr = new Scanner(System.in);

		
		while (true) {
			System.out.println("Enter the Number");
			int number = scr.nextInt();
			if (number > 0 && number < 26) {
				int result = 1;
				for (int i = 1; i <= number; i++) {
					result = result * i;
				}
				System.out.println(result);
			}
			else {
				System.out.println("Enter the number between 1 - 25");
			}
			break;
		}
	}
}
