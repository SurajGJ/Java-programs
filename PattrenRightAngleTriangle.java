package com.programs;

public class PattrenRightAngleTriangle {

	public static void main(String[] ar) {
		int n = 5;
		 for (int i=1; i<=n; i++) {
			 for(int j=i; j<=n; j++) {		// to create the space at starting
				 System.out.print("  ");	// uses space or else it will be triangle
			 }
			 
			 for (int j=1; j<=i ; j++) {	
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		
	}
}
