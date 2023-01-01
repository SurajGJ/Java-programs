package com.programs;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner scr = new Scanner(System.in);
		long number = scr.nextInt();
		long reverse = 0L;
		while (number != 0) {
			long remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		System.out.println("Reversed number : " + reverse);
	}
}
