package com.constructor.constructor_overloading;

public class Medicine {

	String name;
	String dose;
	double price;
	
	Medicine(){
		
	}
	
	Medicine ( String name,String dose, double price){
		this.name = name;
		this.dose = dose;
		this.price = price;
	}
}
