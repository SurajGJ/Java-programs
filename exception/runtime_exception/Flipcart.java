package com.exception.runtime_exception;

public class Flipcart {

	String products[] = { "Chair", "Table", "Tv", "Fridge", "Washiing Machine", "Mobile", "Toys", "Footware",
			"Furniture", "Bag", "Gyser" };

	void search(String product) {
		boolean isavilable = false;
		for (int i = 0; i < this.products.length; i++) {
			if (products[i].equals(product)) {
				isavilable = true;
			} 
		}	
		if(isavilable) {
			System.out.println("Product added to cart");
		}
		else{
			throw new FlipcartException();
		}
		
	}
}
