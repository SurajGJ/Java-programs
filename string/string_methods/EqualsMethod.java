package com.string.string_methods;

public class EqualsMethod {
	public static void main(String[] args) {
		String s = "Thank";
		String s1 = new String("Thank");
		String s2 = "thank";
		s.equalsIgnoreCase(s2);
		System.out.println(s.equals(s1)); // this checking the content of the references
		System.out.println(s == s1);      // this checking the address of the references
		System.out.println(s == s2);
		System.out.println(s.equalsIgnoreCase(s2));// this checking the address and return boolean
		
		
		
		
	}
}
