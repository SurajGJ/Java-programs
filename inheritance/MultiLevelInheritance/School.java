package com.inheritance.MultiLevelInheritance;

public class School {
	public static void main(String[] data) {
		
		Students object = new Students();
		
		object.headMaster();
		System.out.println();
		object.teacher();
		
		System.out.println();
		object.headMaster();
		object.teacher();
		object.students();
		
		
	}
}
