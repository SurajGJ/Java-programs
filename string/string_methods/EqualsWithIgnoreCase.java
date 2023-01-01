package com.string.string_methods;

public class EqualsWithIgnoreCase {
	public static void main(String[] args ) {
		String s = "NIGHT Sky";
		String s1 = "night SKY";
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s1.formatted(args));
	}
}
// It is not case sensitive it will compare the string even it is in Lowercase or Uppercase