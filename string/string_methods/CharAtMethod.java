package com.string.string_methods;

public class CharAtMethod {
	public static void main(String [] args) {
		String s = "A Thank You";
		char i = s.charAt(6);
		System.out.println(i);  // determain the character at its respective index
		
	////	System.out.println(s.chars());
		System.out.println(s.codePointAt(0)); // ASCII value of the charecter at the respective index
		
		System.out.println(s.codePointBefore(9));  // determine the ASCII value before its index
		
		System.out.println(s.codePointCount(0, 9));  // It check how many indexes are their at between 0 and 9

	}

}
