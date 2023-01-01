package com.programs;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] fghj) {
		Scanner scr = new Scanner(System.in);
		int n=2;
		do {
			System.out.println("Enter the Number");
			int number = scr.nextInt();
			if (number > 0) {
				for (int i = 1; i <= number; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
			}else
				System.out.println("Enter the number Greater than 0 ");
			n--;
		}while(n == 0);
	}
}
