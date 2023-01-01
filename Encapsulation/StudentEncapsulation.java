package com.Encapsulation;

public class StudentEncapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Suraj");
		student.setRollNo(045);
		student.setPercentage(65.38);
		student.setResult('P');
		student.setSchool("Vidyalaya");
		System.out.println(student.toString());
			
	}
}
