package com.inheritance.hasARelationship;

public class School{
	String name;
	String address;
	int totalClass;
	Teachers teacher = new Teachers(45000);

	void teach(){
		System.out.println("Teacher Name : "+teacher.name);
		System.out.println("Qualification : "+teacher.qualification);
		System.out.println("Salary : "+teacher.salary);
	}
	
	void learn(){
		System.out.println("School Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Total Number of Class : "+totalClass);
	}
	
}
