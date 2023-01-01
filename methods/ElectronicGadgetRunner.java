package com.methods;

public class ElectronicGadgetRunner {

	public static void main(String[] args) {
		ElectronicGadget tv = new ElectronicGadget("MI", "UK7849E", 25000.00);
		ElectronicGadget washingMachine = new ElectronicGadget("LG", "V84KNSD", 17599.00);
		ElectronicGadget fridge = new ElectronicGadget("SAMSUNG", "3J8KJ89", 22000.00);
		ElectronicGadget inductionStow = new ElectronicGadget("V-Gaurd", "9DFSI4", 13500.00);
		
		System.out.println("Television "+tv.toString());
		System.out.println("Washing Machine "+washingMachine.toString());
		System.out.println("Fridge "+fridge.toString());
		System.out.println("Induction Stow "+inductionStow.toString());
	}
}
