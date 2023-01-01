package com.constructor.paramertized_constructor;

public class Bag {

	String type;
	String color;
	String brand;
	
	Bag(String type, String color, String brand){
		this.type = type;
		this.color = color;
		this.brand = brand;
	}
	
	
	void pack() {
		System.out.println(brand +" "+type+" "+color);
	}
}
