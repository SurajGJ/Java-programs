package com.constructor.default_constructor;

public class LaptopDefaultConstructor {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		
		System.out.println("Default valus intialized by Constructor");
		laptop.outCome();
		
		laptop.brand = "Lenovo";
		laptop.color = "Gray";
		laptop.displaySize = 15.6f;
		laptop.price = 49499.99f;
		
		System.out.println();
		laptop.outCome();

	}
}
