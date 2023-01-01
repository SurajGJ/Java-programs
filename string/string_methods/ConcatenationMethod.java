package com.string.string_methods;

public class ConcatenationMethod {
	public static void main(String [] ars) {
		String g = "Grand";
		String t = "d";
		String a = "Auto";
		String name = g.concat(t);
		String fullName = name.concat(a);
		System.out.println(fullName);
	}
}
// This method helps to add the two String, till now we are doing concatenation in 
// System.out.println, it cannot be possible other than SOP, 
// So this method is used