package com.string.string_methods;

import java.io.UnsupportedEncodingException;

public class IndexOfMethod {
	
	public static void main(String[] args0) throws UnsupportedEncodingException {
		String s = "TheGreatBritain";
		char ch = 'G';
		String s1 ="B";
		System.out.println(s.indexOf(ch));
		System.out.println(s.indexOf(71));
		System.out.println(s.indexOf(s1));
		//System.out.println(s.);
		//System.out.println(s.indexOf(71, 66));
		//System.out.println(s1.i22222222ndexOf(s, 65));
		System.out.println(s.lastIndexOf(ch));
		System.out.println();
	}
}
