package com.constructor.paramertized_constructor;

public class Telivision {

	String brand;
	String type;
	double price;
	
	Telivision(String company, String design, Double rate){
		brand = company;
		type = design;
		price = rate;
	}
	
	void telivision() {
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
	}
}
