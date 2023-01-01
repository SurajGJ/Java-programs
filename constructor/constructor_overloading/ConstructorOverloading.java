package com.constructor.constructor_overloading;

public class ConstructorOverloading {
	
	public static void main (String[] args) {
		
		Medicine medicine = new Medicine("Dolo", "650 mg", 2.5);
		
		System.out.println(medicine.name+" "+medicine.dose+" "+medicine.price+"/- Rs");
	}

}
