package com.programs;

public class SquareRoot {
	public static void main(String[] args) {
		int n = 300;
		int i=1;
		while (i<n) {
			if(i*i <= n)
				System.out.println(i);
			i++;
			System.out.println(i);
		}

	}
}
