package com.constructor.constructor_overloading;

public class WaterPurifier {

	String brand;
	String model;
	int capacity;
	int warrenty;
	double price;
	
	WaterPurifier() {		
		System.out.println("Default Constructor");
		System.out.println();
		}
	
	WaterPurifier(String brand,String model,int capacity){
		System.out.println("3 Parametrized Constructor");
		System.out.println();
		this.brand = brand;
		this.model= model;
		this.capacity = capacity;
	}
	
	WaterPurifier(String brand,String model,int capacity,int warrenty,double price){
		System.out.println("2 Parametrized Constructor");
		this.brand = brand;
		this.model= model;
		this.capacity = capacity;
		this.warrenty = warrenty;
		this.price = price;
	}
	void calling() {
		System.out.println("Water Purifier Name : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Capacity in liters : "+capacity);
		System.out.println("Warrenty : "+warrenty);
		System.out.println("Price of this Product : "+price+" K");
	}
}
