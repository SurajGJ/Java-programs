package com.string;

public class StringDemo {

	public static void main(String [] args) {
		String s = "Thid";
		String s1 = "Class";
		System.out.println(s == s1);
		
		String s2 = new String("Class");
		//String s3 = new String("Secon Class");
		String intern = s2.intern();
		System.out.println(s1==s2.intern());
	}
}
