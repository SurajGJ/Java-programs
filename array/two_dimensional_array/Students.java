package com.array.two_dimensional_array;

public class Students {

	String name;
	int id;
	String branch;
	String collage;
	
	public Students(String name,int id,String branch,String collage) {
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.collage = collage;
	}

	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + ", collage=" + collage + "]";
	}
	
}
