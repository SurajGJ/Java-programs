package com.array.one_dimensional_array;

public class ArrayOneDTest {
	String[] fruits = { "Banana", "Jack Fruit", "Orange","Apple", "Pomogranate", "Toomoto" };
	public boolean test() {
		for(int i=0; i<fruits.length; i++) {
			if (fruits[i].equals("Apple")) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayOneDTest aod = new ArrayOneDTest();
		if(aod.test())
			System.out.println("Apple is present in the list");
		else
			System.out.println("Apple is not present in the list");
	}
}			
