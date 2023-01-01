package com.class_1_dec_20;

public class TheaterDTO {

	private Integer slNo;
	private String name;
	private String location;
	private Integer noOfScreens;
	
	public TheaterDTO() {
		System.out.println("Output is from default constructor");
	}
	
	public TheaterDTO(Integer slNo, String name, String location, Integer noOfScreens) {
		super();
		this.slNo = slNo;
		this.name = name;
		this.location = location;
		this.noOfScreens = noOfScreens;
		System.out.println("Dto Parametrized Constructor");
	}


	public Integer getSlNo() {
		return slNo;
	}
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getNoOfScreens() {
		return noOfScreens;
	}
	public void setNoOfScreens(Integer noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	@Override
	public String toString() {
		return "TheaterDTO [slNo=" + slNo + ", name=" + name + ", location=" + location + ", noOfScreens=" + noOfScreens
				+ "]";
	}


	
	
	
}
