package com.string.string_methods;

public class ContainMethod {
	public static void main(String[] args) {
		String s = "A for Apple";
		String s1 = "o";
		String s2 = new String("A for Apple");
		System.out.println(s.contains(s1));  // it check weather the s contain the s1 charecter
		System.out.println(s.contains(s2));  // It is case Sensitive
		//System.out.println(s.hashCode());
		//System.out.println(s.lastIndexOf(s1));
		//System.out.println(s.length());
		
		System.out.println(s.contentEquals(s1)); // content checking method
		System.out.println(s.contentEquals(s2));
		System.out.println(s1.describeConstable()); // describe the string what the reference veriable holds
		
	}
}
// it check weather the first String contain any of the char in that string and return 
// boolean result;