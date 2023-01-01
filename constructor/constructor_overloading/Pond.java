package com.constructor.constructor_overloading;

public class Pond {

	String name;
	String diameter;
	String deapth;
	double capacity;
	
	Pond(){
		System.out.println("Default Constructor");
	}
	
	Pond(String name,String diameter,String deapth,double capacity){
		System.out.println("Parametrized Constructor");

		this.name=name;
		this.deapth=deapth;
		this.diameter=diameter;
		this.capacity=capacity;
	}
}
