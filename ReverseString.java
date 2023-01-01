package com.programs;

public class ReverseString {
	public static void main(String[] args) {
		String input = "Suraj";
		String reverse = "";
		
		if(input != null && input.isEmpty() ) {
			System.out.println(input);
		}
		
		for (int i=input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
