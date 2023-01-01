package com.array.one_dimensional_array;

public class OneDArray {

	public static void main(String[] args) {
		int[] num = new int[5];
		int n = 10;
		for (int i = 0; i<num.length; i++) {
			num[i] = n;
			n=n+10;
		}
		for (int i= 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}
