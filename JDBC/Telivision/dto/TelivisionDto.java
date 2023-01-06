package com.xworkz.telivision.dto;

public class TelivisionDto {

	private String brandName;
	private String model;
	private double priceInK;
	private double screenSizeInInches;
	private String type;
	private String color;
	
	public TelivisionDto() {
		super();
	}

	public TelivisionDto(String brandName, String model, double priceInK, double screenSizeInInches, String type,String color) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.priceInK = priceInK;
		this.screenSizeInInches = screenSizeInInches;
		this.type = type;
		this.color = color;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPriceInK() {
		return priceInK;
	}

	public void setPriceInK(double priceInK) {
		this.priceInK = priceInK;
	}

	public double getScreenSizeInInches() {
		return screenSizeInInches;
	}

	public void setScreenSizeInInches(double screenSizeInInches) {
		this.screenSizeInInches = screenSizeInInches;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TelivisionDto [brandName=" + brandName + ", model=" + model + ", priceInK=" + priceInK
				+ ", screenSizeInInches=" + screenSizeInInches + ", type=" + type + ", color=" + color + "]";
	}
	
}
