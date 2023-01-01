package com.basicPrograms;
import java.util.Scanner;
public class GreatestOfTherNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Three Numbers : ");
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = scr.nextInt();
			int outCome = (a>b)? ((a>c)? a: c) : ((b>c)? b:c);
			System.out.println(outCome +" is Greater");
		}
	}
}
