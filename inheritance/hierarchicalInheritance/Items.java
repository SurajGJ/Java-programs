package com.inheritance.hierarchicalInheritance;

public class Items {

	public static void main(String[] args) {
	
		Mobile mobile = new Mobile();
			mobile.gadgetsUsingElecricity();
			mobile.jangamaVani();
			System.out.println();
			
		Telivision telivision = new Telivision();
			telivision.gadgetsUsingElecricity();
			telivision.tv();
			System.out.println();
			
		WashingMachine cloths = new WashingMachine();
			cloths.gadgetsUsingElecricity();
			cloths.wash();
	}

}
