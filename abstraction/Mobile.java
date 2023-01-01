package com.abstraction;

public class Mobile {

	public static void main(String[] args) {
		
		System.out.println("Mobile can be used for");
		NokiaSmartphone mobile = new NokiaSmartphone();
		
		mobile.call();
		mobile.msg();
		mobile.internet();
		mobile.videoCall();
		mobile.games();
	}
}
