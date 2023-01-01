package com.constructor.constructor_chaining;

public class Plastic {

	String thickness;
	String shape;
	String weight;
	
	Plastic(){
		this("0.5 mm", "Circle", "100 gm");
		System.out.println("Parent class Plastic Constructor");
	}
	Plastic(String thickness, String shape, String weight){
		this.thickness = thickness;
		this.shape = shape;
		this.weight = weight;
		
		System.out.println(thickness+" "+shape+" "+weight);
	}
}
