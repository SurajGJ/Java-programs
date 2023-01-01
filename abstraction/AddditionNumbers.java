package com.abstraction;

public class AddditionNumbers {

	public static void main(String[] args) {

		AdditionProcess add = new AdditionProcess();
		add.number1=100;
		add.number2=30;
		System.out.println("Addition of Two number");
		
		add.outCome();
		System.out.println(add.addNumbers() );
	}

}
