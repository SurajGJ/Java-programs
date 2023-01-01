package com.constructor.paramertized_constructor;

public class ParameterizedConstructorForBag {

	public static void main(String[] args) {

		Bag bag = new Bag("Laptop Bag","Black", "Lenovo" );
		
		bag.pack();
		
		Bag bag1 = new Bag("School Bag","Grey", "Puma" );

		bag1.pack();
		
		Bag bag2 = new Bag("Travelling Bag","Military Theme", "American Turistor" );
		bag2.pack();


	}

}
