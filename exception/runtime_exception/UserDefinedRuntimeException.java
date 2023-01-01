package com.exception.runtime_exception;

public class UserDefinedRuntimeException {
	public static void main(String[] args) {
//Chair", "Table", "Tv", "Fridge", "Washiing Machine", "Mobile", "Toys", "Footware",
//"Furniture", "Bag", "Gyser"
		Flipcart flipcart = new Flipcart();
		try {
			flipcart.search("WashiingMachine");
		}
		catch(FlipcartException e){
			System.out.println(e);
		}
	}
}
