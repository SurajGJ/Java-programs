package com.polymorphism.methodOveriding;

public class MethodOveriding {

	public static void main(String[] args) {

		RBI rbi = new RBI();
		SBI sbi  = new SBI();
		HDFC hdfc = new HDFC();
		
		System.out.println("RBI intrest : "+rbi.intrest() );
		System.out.println("SBI intrest : "+sbi.intrest() );
		System.out.println("HDFC intrest : "+hdfc.intrest() );
	}

}
