package com.programs;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] uujuj) {
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		int result = 0;
		int n = 6;
		while (n > 0) {
			while (number > 0) {
				result = result + number;
				number--;
			}
			n--;
		}
		System.out.println(result);
	}
}
