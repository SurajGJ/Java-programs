package com.inheritance.hasARelationship;

public class EcoSystem {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		System.out.println("Herbiours : Animal survive by eating "+animal.food.food1);
		for (int i=0; i<4; i++) {
			String ref0 = animal.herbivores[i];
			System.out.println(ref0);
		}
		System.out.println();
		
		System.out.println("Carnivorous : Animal survive by eating "+animal.food.food2);
		for (int i=0; i<4; i++) {
			String ref1 = animal.carnivorous[i];
			System.out.println(ref1);
		}
		System.out.println();
		
		System.out.println("Omnivores : Animal survive by eating "+animal.food.food3);
		for (int i=0; i<4; i++) {
			String ref2 = animal.omnivores[i];
			System.out.println(ref2);
		}

	}

}
