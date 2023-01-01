package com.inheritance.hasARelationship;

public class Agreegation {

	public static void main(String[] args) {
		Library library = new Library();
		
		System.out.println("Library Details");
		System.out.println("Library name : "+library.name);
		System.out.println("Location : "+library.location);
		System.out.println("Total number of books in Library : "+library.noOfBooks);
		
		System.out.println();
		
		System.out.println("Student Details form Library");
		System.out.println("STudent name : "+library.student.name);
		System.out.println("Address : "+library.student.address);
		System.out.println("Student contact number : "+library.student.phNo);

	}

}
