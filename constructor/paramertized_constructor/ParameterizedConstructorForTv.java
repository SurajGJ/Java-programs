package com.constructor.paramertized_constructor;

public class ParameterizedConstructorForTv {

	public static void main(String[] args) {
		
		Telivision tv = new Telivision("mi","LCD",24499.99);
		tv.telivision();
		
		tv = new Telivision("Sony","LCD",34999.99);
		tv.telivision();
	}
}
