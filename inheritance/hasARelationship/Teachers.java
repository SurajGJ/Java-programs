package com.inheritance.hasARelationship;

public class Teachers{
	String name;
	String qualification;
	int salary;
	
	Teachers(int salary){
		System.out.println("Iam Constructor");
		this.salary = salary;
		if( salary > 40000) {
			System.out.println("Good Salary");
		}
	}
}
