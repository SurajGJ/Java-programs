package com.xworks.pencil.dto;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@javax.persistence.Table(name = "pencil")
@javax.persistence.Entity


public class PencilDto {

	
	@Id
	private int id;
	private String name;
	private String shape;
	private String color;
	private int price;
	
	
	public PencilDto(int id, String name, String shape, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.shape = shape;
		this.color = color;
		this.price = price;
	}


	public PencilDto() {
		super();
		
	}


	@Override
	public String toString() {
		return "PencilDto [id=" + id + ", name=" + name + ", shape=" + shape + ", color=" + color + ", price=" + price
				+ "]";
	}


		
	
	
	
}
