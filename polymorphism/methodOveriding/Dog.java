package com.polymorphism.methodOveriding;

public class Dog extends Animal{
	String breadName;
	String name;
	String color;
	int age;
	
	void creature() {
		System.out.println("Dog is one of the which can be adopted commonly ");
		System.out.println("Bread Name : "+breadName+" Name of Your Dog: "+name+" Color : "+color+" Age : "+age);
	}
}
