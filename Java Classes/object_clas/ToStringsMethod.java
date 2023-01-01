package com.java_classes.object_clas;

public class ToStringsMethod {
	
	ToStringsMethod(){
		System.out.println(" I am Constructor, i has method in my body");
		System.out.println(toString( ) );
		//toString();
	}

	String gj = "Suraj";
	public String toString() {
		return "Idont kwnow what, but iam "+gj;
	}
	public static void main(String[] args) {
		ToStringsMethod tsm = new ToStringsMethod();
		//System.out.println(tsm+" "+tsm.hashCode());
		//System.out.println(tsm.toString( ) );
	}
}
