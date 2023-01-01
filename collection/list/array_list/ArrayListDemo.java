package com.collection.list.array_list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>();
		Student suraj = new Student("Suraj", "a01", "JNNCE");
		Student hritik = new Student("Hritik", "a02", "RITZ");
		Student roshan = new Student("Roshan", "a03", "EMPC");
		Student sharuk = new Student("Sharuk", "a04", "TEKP");
		Student khan = new Student("khan", "a05", "AHCE");

		student.add(suraj);
		student.add(hritik);
		student.add(roshan);
		student.add(sharuk);
		student.add(khan);
		
		for (Student s : student) {
			if (s.collage.equals("JNNCE")) {
				System.out.println(s);
			}
		}
		System.out.println(student.contains(roshan));

	}
}
