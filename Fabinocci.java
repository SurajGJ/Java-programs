package com.programs;

public class Fabinocci {
	public static void main(String[] args) {
		int n1=1;
		int n2=1;
		int n;
		int total=15;
		System.out.println("Fabinocci series upto "+total);
		for(int i=0; i<total; i++) {
			System.out.print((n=n1+n2)+" ");
			n1=n2;
			n2=n;
		}
	}
}
