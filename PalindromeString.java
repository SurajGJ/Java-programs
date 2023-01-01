package com.programs;

public class PalindromeString {
	
	public static void main(String[] tyui) {
		
		String input = "qwertytrewq";
		String reversseInput= "";
		for(int i = input.length()-1; i>=0; i--)
			reversseInput += input.charAt(i);
		
		String outCome = (input == reversseInput)? "Palindrome":"Non-Palindrome";
		System.out.println(input+" is "+outCome);
	}

}
