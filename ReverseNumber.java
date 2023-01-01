package com.basicPrograms;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(true) {
			int number= scr.nextInt();

			int result = 0;
			while (number > 0) {
				int remainder = number % 10;
				result = (result * 010)+ remainder;
				number = number/10;
			}
				System.out.println(result);
		}
	}
}
