package com.constructor.default_constructor;

public class DemoDefaultConstructor {

	public static void main(String [] args) {
		
		Fan fan = new Fan();
		System.out.println("Fan Brand : "+fan.brand);
		System.out.println("Color : "+fan.color );
		System.out.println("Type : "+fan.type );
		System.out.println("sPrice : "+fan.price );
		
		fan.type = "Table Fan";
		System.out.println("Type : "+fan.type );
	}
}