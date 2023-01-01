package com.descion_making.ifelseif;

public class GradeSystem {

	public static void main(String[] args) {
		
		int marks = 86;
		
		System.out.println("Marks Obtained : "+marks);
		
		if ( marks < 35 )
			System.out.println("Fail");
		
		else if( marks >= 35 && marks <= 50)
			System.out.println("Pass, Grade : D");
		
		else if ( marks > 50 && marks < 75)
			System.out.println("Pass, Grade : C");
		
		else if ( marks >= 75 && marks <= 85)
			System.out.println("Pass, Grade : B");
		
		else if ( marks > 85 && marks <= 100)
			System.out.println("Pass, Grade : A");
		
		else
			System.out.println("Please input valid Marks");

	}

}
