package com.collection.list.array_list;

public class Student {
	
	String name;
	String id;
	String collage;
	
	Student(String name, String id, String collage){
		this.name = name;
		this.id = id;
		this.collage = collage;
	}
	
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", collage=" + collage + "]";
	}
	
}
