package com.xworkz.bags.dto;

public class BagsDto {

	private String name;
	private int id;
	private String color;
	private int price;
	private int capcity;
	
	
	public BagsDto() {
		super();
	}


	public BagsDto(String name, int id, String color, int price, int capcity) {
		super();
		this.name = name;
		this.id = id;
		this.color = color;
		this.price = price;
		this.capcity = capcity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCapcity() {
		return capcity;
	}


	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}


	@Override
	public String toString() {
		return "BgsDto [name=" + name + ", id=" + id + ", color=" + color + ", price=" + price + ", capcity=" + capcity
				+ "]";
	}
	
}
