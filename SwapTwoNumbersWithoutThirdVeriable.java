package com.programs;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVeriable {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a value");
			double a = scr.nextDouble();
			System.out.println("Enter b value");
			double b = scr.nextDouble();
			System.out.println("Before Swap a = "+a +" and b = "+b);

				a = a+b;
				b = a-b;
				a = a-b;
				System.out.println("After Swap a = "+a +" and b = "+b);
		}
			
	}

}
