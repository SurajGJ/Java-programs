package com.programs;

public class GreatestOfThreeNumber {

	public static void main(String[] args) {
		int n1=8;
		int n2=8;
		int n3=47;
		System.out.println(n1+" "+n2+" "+n3);
		int greatest;
		greatest = ( n1 > n2 )? ( ( n1 > n3)? n1 : n3 ) :  ( ( n2 > n3)? n2 : n3 );
		System.out.println(greatest+" is Greatest among Three Number");
	}
}
