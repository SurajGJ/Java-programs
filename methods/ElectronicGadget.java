package com.methods;

public class ElectronicGadget {
	String brand;
	String modelNo;
	double price; 
	
	ElectronicGadget(String brand, String modelNo, double price){
		this.brand = brand;
		this.modelNo = modelNo;
		this.price = price;
	}
	public String toString() {
		return " [brand=" + brand + ", modelNo=" + modelNo + ", price=" + price + "]";
	}
	
}
