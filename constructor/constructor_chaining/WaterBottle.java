package com.constructor.constructor_chaining;

public class WaterBottle extends Plastic {

	static String brand;
	static double price;
	static String quantity;

	WaterBottle() {
		this("KingFissher", 18.5, "1 Liter");
		System.out.println("Child class default constructor");
	}

	WaterBottle(String brand, double price, String quantity) {
		super();
		System.out.println(brand+price+quantity);
		System.out.println(outCopme("KingFissher", 18.5, "1 Liter"));

	}

	public String outCopme(String brand, double price, String quantity) {
		return "Water Bottle brand : " + brand + ", Price : " + price + ", Quantity : " + quantity;
	}

}
