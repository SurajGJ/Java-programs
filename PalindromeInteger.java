package com.programs;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int number = 2;
		while (true) {
			int number1 = scr.nextInt();
			int value = number1;
			int remainder, reverse = 0;
			while (number1 != 0) {
				remainder = number1 % 10;
				reverse = reverse * 10 + remainder;
				number1 = number1 / 10;
			}
			String outCome = (value == reverse) ? "Palindrome" : "Not Palindrome";
			System.out.println(value + " " + outCome);
		}

	}
}