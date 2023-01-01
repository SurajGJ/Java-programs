package com.string.string_methods;

public class StartsWithMethod {
	public static void main(String [] ert) {
		String s = "Hotel";
		String s1 = "H";
		String s2 = "h";
		String s3 = "Botel";
		System.out.println(s.startsWith(s1));
		System.out.println(s.startsWith(s2));
		System.out.println(s.startsWith(s3));
		System.out.println(s.equals(s3));
	}
}
// check weather the string s starts with the same String(char) s1, s2, s3 or not