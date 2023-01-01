package com.polymorphism.methodOverLoading;

public class Addition {

	public static void main(String[] args) {

		AddNumber1 add1 = new AddNumber1();
		Addnumber2 add2 = new Addnumber2();
		
		System.out.println("Addition of two numer 5 and 4 : "+add1.adding(5, 4) );
		
		System.out.println("Subtraction of two numer 7 and 2 : "+add2.adding(5, 4) );
	}

}
