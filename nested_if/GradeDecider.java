package com.descion_making.nested_if;

public class GradeDecider {

	public static void main(String[] args) {
		int marks=99;
		char gradeforphysical = 68;
		if (marks >= 35) {
			
			if(gradeforphysical >64  && gradeforphysical <= 68) {
				System.out.println("Good in physical Test");
			}
			else {
				System.out.println("Improve your Physical Strengths only marks is not enough");
			}
			
			System.out.println("Result is pass, marks obtained : "+marks);
		}
		else
			System.out.println("Fail, Better luck Next Time");

	}

}
