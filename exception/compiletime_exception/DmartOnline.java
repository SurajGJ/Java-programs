package com.exception.compiletime_exception;

//import java.util.Scanner;

public class DmartOnline {

	public static void main(String[] args) {
		ProductInDmart pid = new ProductInDmart();

		/*System.out.println("Select the items in this list of Items avilable");
		for (int i = 0; i < pid.items.length; i++) {
			System.out.println(i + 1 + " " + pid.items[i]);
		}
		Scanner scr = new Scanner(System.in);
		int n = 6;
		while (n >= 0) {*/
			String productName = "Soap"; //scr.next();
			if (productName.isEmpty() != true) {
				try {
					pid.find(productName);
				} catch (DmartException e) {
					System.out.println(e);
				}
			}
		//	n--;}
	}
}
