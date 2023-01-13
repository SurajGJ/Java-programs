package com.xworkz.shirt.dto;

public class ShirtDto {

	private int id;
	private String name;
	private String color;
	private int size;
	private boolean hasPacket;
	
	
	public ShirtDto() {
		super();
	}


	public ShirtDto(int id, String name, String color, int size, boolean hasPacket) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.size = size;
		this.hasPacket = hasPacket;
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public boolean isHasPacket() {
		return hasPacket;
	}


	public void setHasPacket(boolean hasPacket) {
		this.hasPacket = hasPacket;
	}


	@Override
	public String toString() {
		return "ShirtDto [id=" + id + ", name=" + name + ", color=" + color + ", size=" + size + ", hasPacket="
				+ hasPacket + "]";
	}
	
	
	
}
