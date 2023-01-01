package com.programs;

import java.util.Scanner;

public class PositiveOrNegetive {

	public static void main(String[] art) {
		Scanner scr = new Scanner(System.in);
		while (true) {
			int number = (int)scr.nextInt();
			if (number == 0) {
				System.out.println("0 is either Positive or Negrtive number");
			}else if (number > 0) {
				System.out.println("Positive Number");
			} else
				System.out.println("Negetive Number");
		}
			
	}
}
