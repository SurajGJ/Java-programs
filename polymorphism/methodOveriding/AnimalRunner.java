package com.polymorphism.methodOveriding;

public class AnimalRunner {

	public static void main(String[] args) {
		Cow cow = new Cow();
		Dog dog = new Dog();
		
		dog.creature();
		dog.creature();
		cow.creature();
		
	}
}
