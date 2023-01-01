package com.exception.compiletime_exception;

public class JIouiiu {
	String items[] = {"Soap", "Shampoo", "Brush","Phynyle", "Toothpaste", "Mop"};
	
	void find(String productName) {
		
		for (int i = 0; i < items.length; i++) {
			
			boolean result = items[i].contains(productName);
			
			if( result == false) {
				System.out.println("Out of Stock");
				break;
				
			}else {
				System.out.println("Add Item to Cart");
				break;
			}				
		}
	}
	public static void main(String[] args) throws DmartException {
		JIouiiu h =new JIouiiu();
		h.find("Brush");
	}
}
