package com.exception.compiletime_exception;


public class ProductInDmart {
	
	String items[] = {"Soap", "Shampoo", "Brush","Phynyle", "Toothpaste", "Mop"};

	void find(String productName) throws DmartException{
		boolean isProductFound = false;
		for (int i = 0; i < items.length; i++) {
			
			if( items[i].equals(productName)) {
				isProductFound = true;
			}		
		}
		if(isProductFound) {
			System.out.println("Added Item "+productName+" to Cart");					
		}
		else {
			DmartException dme = new DmartException();
			throw dme;
		}
	}	
}
