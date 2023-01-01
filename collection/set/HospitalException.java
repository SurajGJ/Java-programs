package com.collection.set;

public class HospitalException extends Exception{

	public String toString() {
		return "Enter valid Hospital details";
	}

	@Override
	public String getMessage() {
		return "Hospital is not found";
	}
	
}
