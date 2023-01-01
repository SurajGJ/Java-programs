package com.TypeCasting.primitive_casting;

public class Bag {
	public static void main(String[] aargs) {
		int number = 10;
		byte n =(byte) number;   // explicit (in size decreasing order)
		int yu = 00000040;
		long hoo= number;        // implicit ( in size increasing order)
		char no = (char) yu;
		System.out.println(number+"int");
		System.out.println(n+"byte");
		System.out.println(hoo+"long");
		System.out.println(no+" char");
		
	}

}
