package com.java_classes.object_clas;

public class EqualsMethod {
	String name;
	String petname;

	EqualsMethod(String name, String petname){
		this.name = name;
		this.petname = petname;
		int a = 54;
		int b = 9;
		b = a - b;
	}
	public boolean equals(Object obj){
		
			EqualsMethod em = (EqualsMethod) obj;
			if(name.equals(em.getName()) && petname.equals(em.getName()) )
				return true;
			else
				return false;
			
	
	
	public static void main(String[] args) {
		EqualsMethod em1 = new EqualsMethod("Suraj", "Gj");
		EqualsMethod em2 = new EqualsMethod("Hitesh", "Sisya");
		EqualsMethod em3 = new EqualsMethod("Suraj", "Gj");
		EqualsMethod em4 = em1;
		System.out.println(em1.equals(em3));
	}

}

