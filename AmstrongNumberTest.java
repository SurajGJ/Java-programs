package com.basicPrograms;
import java.util.Scanner;

public class AmstrongNumberTest {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Number : ");
			int number = scr.nextInt();
			int value = number;
			int result = 0;
			while(number >0 ) {
				int remainder = number % 10;
				result = result +(remainder*remainder*remainder);
				number = number/10;
			}
			String outCome = (value == result)?  "Amstromg number": "Not Amstrong Number";
			System.out.println(outCome);
		}
	}
}
