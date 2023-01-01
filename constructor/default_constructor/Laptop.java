package com.constructor.default_constructor;

public class Laptop {
	
	String brand;
	String color;
	float displaySize;
	float price;
	
	Laptop(){
		System.out.println("Iam Constructor");
	}

	void outCome() {
		System.out.println("Laptop Brand is "+brand+", "+color+" in Color, Display size of "+displaySize+" inch and price is "+price+"/- Rs Only");
	}
}
