package com.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		TreeEncapsulation tree = new TreeEncapsulation();
		tree.setName("Mango Tree");
		tree.setAge(100);
		tree.setWidth("10 ft");
		System.out.println(tree.getName() );
		System.out.println(tree.getAge() );
		System.out.println(tree.getWidth() );
	}
}
