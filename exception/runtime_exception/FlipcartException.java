package com.exception.runtime_exception;

public class FlipcartException extends RuntimeException{

	@Override
	public String toString() {
		return "Product not found";
	}
	
}
