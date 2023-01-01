package com.programs;

public class ReverseStringRecur {

	public static void main(String[] args) {
		String input = "Suraj";
		String reverse = "";
		for (int i= input.length()-1; i<=0; i--) {
			reverse = reverse +input.charAt(i);
		}
		System.out.println(input);
		System.out.println(reverse);
	}
}
