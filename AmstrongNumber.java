package com.programs;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = 5;
		
		while( n > 0) {
			System.out.println("Enter the Number");
			int number = input.nextInt(),value=number,result=0;
			while( number >0 ) {
				int remainder = number % 10;
				result = result + (remainder * remainder * remainder);
				number = number / 10;
			}
			String outCome = (value == result)? "Amstrong number": "Not Amstrong Number";
			System.out.println(outCome);
			n--;
		}
	}

}
