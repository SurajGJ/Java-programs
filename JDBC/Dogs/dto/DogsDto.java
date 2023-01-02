package com.xworkz.dogs.dto;

public class DogsDto {

	private String breadName;
	private String originatedIn;
	private double height;
	private double weight;
	private String size;
	
	DogsDto(){
	}

	public DogsDto(String breadName, String originatedIn, double height, double weight, String size) {
		super();
		this.breadName = breadName;
		this.originatedIn = originatedIn;
		this.height = height;
		this.weight = weight;
		this.size = size;
	}

	public String getBreadName() {
		return breadName;
	}

	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}

	public String getOriginatedIn() {
		return originatedIn;
	}

	public void setOriginatedIn(String originatedIn) {
		this.originatedIn = originatedIn;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "DogsDto [breadName=" + breadName + ", originatedIn=" + originatedIn + ", height=" + height + ", weight="
				+ weight + ", size=" + size + "]";
	}
	
	
	
}
