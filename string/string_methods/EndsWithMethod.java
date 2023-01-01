package com.string.string_methods;

public class EndsWithMethod {
	public static void main(String[] args) {
		String s = "Grand";
		String s1 = "d";
		String s2 = "D";
		String s3 = "Brand";
		System.out.println(s.endsWith(s1));
		System.out.println(s.endsWith(s2));
		System.out.println(s.endsWith(s3));
	}
}
// it check weather the first String s (Grand) is ending with the same Second String s1 (d)
// it return boolean value