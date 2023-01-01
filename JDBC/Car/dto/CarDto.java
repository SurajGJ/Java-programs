package com.xworkz.car.dto;

public class CarDto {

	private String brand;
	private String color;
	private String type;
	private int speed;
	private double price;
	
	public CarDto() {
		
	}
	
	public CarDto(String brand, String color, String type, int speed, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.speed = speed;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarDto [brand=" + brand + ", color=" + color + ", type=" + type + ", speed=" + speed + ", price="
				+ price + "]";
	}
	
	
}
