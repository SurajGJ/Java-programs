package com.xworkz.airCondition.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airCondition")
public class AirConditionDto {
	
	@Id
	private int id;
	private String name;
	private int powerRating;
	private String color;
	private int price;
	
	public AirConditionDto() {
		super();
	}

	public AirConditionDto(int id, String name, int powerRating, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.powerRating = powerRating;
		this.color = color;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
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

	@Override
	public String toString() {
		return "AirConditionDto [id=" + id + ", name=" + name + ", powerRating=" + powerRating + ", color=" + color
				+ ", price=" + price + "]";
	}
	
}
