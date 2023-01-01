package com.abstraction;

public class AdditionProcess extends Number{

	void outCome() {
		System.out.println("Number 1 = "+number1);
		System.out.println("Number 2 = "+number2);
	}
	
	int addNumbers() {
		int number=number1+number2;
		return number;
	}
}
