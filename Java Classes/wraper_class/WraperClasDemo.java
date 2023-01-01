package com.wraper_class;

public class WraperClasDemo {

	public static void main(String[] args) {
		//Wrapper class has two types
			// Converting the primitive data types to non primitive data type to make
			// java code completely object oriented programming language
		// 1 boxing
		// 2 un boxing
		
		// 1 boxing 
			// converting primitive to non primitive 
		
		// implicit
		 int n = 50;
		 Integer num = n;
		 char  c = 70;
		 Character ch = c;
		 	System.out.println(ch);
		 	System.out.println(num);
		// explicit
		Integer num2 = new Integer(n);
			System.out.println(num2);
			
		// 2 un boxing
			// converting non primitive to primitive data type by using inbuilt methods
			
		// implicit
		Float fl = 12.36f; // Or Float fl = new Float(12.36)
		double f = fl;
			System.out.println(f);
			//System.out.println(fl.MAX_VALUE);
			//System.out.println(fl.MIN_VALUE);
			//System.out.println(fl.MAX_EXPONENT);
			//System.out.println(fl.MIN_EXPONENT);
			//System.out.println(fl.MIN_NORMAL);
		
		// explicit
		Double ni = new Double(54);
		int i = ni.intValue();
			System.out.println(i);		
	}
}
