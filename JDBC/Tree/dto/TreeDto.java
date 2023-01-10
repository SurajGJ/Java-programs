package com.xworkz.tree.dto;

public class TreeDto {

	private int slno;
	private String name;
	private int age;
	private int height;
	private String color;
	private String type;
	
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public TreeDto() {
		
	}
	public TreeDto(int slno, String name, int age, int height, String color, String type) {
		super();
		this.slno = slno;
		this.name = name;
		this.age = age;
		this.height = height;
		this.color = color;
		this.type = type;
	}
	
	
	
}
