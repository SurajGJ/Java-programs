package com.programs;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] art) {
		
		Scanner scr = new Scanner(System.in);
		
		for (int loop = 1; loop <= 5; loop++) {
			
			System.out.println("Enter the Number");
			int number = scr.nextInt();
			if (number > 0) {
				for (int i = 1; i <= number; i++) {
					if (i % 2 == 1) {
						System.out.print(i + " ");
						System.out.println();
					}
				}
			} else {
				System.out.println("Enter the Number Greater than 0");
			}
		}
	}

}
