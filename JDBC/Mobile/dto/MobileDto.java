package com.xworkz.mobile.dto;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString

public class MobileDto {

	private String name;
	private String networkTechnology;
	private String displayType;
	private int resolution;
	private boolean isAndroid;
	private int ram;
	private int rom;
	private boolean isAudioJackAvilable;
	private int battryInMah;
	private int frontCamera;
	private int backCamera;
	private String processorName;
	private double price;
	
	
	public MobileDto() {
		
	}


	public MobileDto(String name, String networkTechnology, String displayType, int resolution, boolean isAndroid,
			int ram, int rom, boolean isAudioJackAvilable, int battryInMah, int frontCamera, int backCamera,
			String processorName, double price) {
		super();
		this.name = name;
		this.networkTechnology = networkTechnology;
		this.displayType = displayType;
		this.resolution = resolution;
		this.isAndroid = isAndroid;
		this.ram = ram;
		this.rom = rom;
		this.isAudioJackAvilable = isAudioJackAvilable;
		this.battryInMah = battryInMah;
		this.frontCamera = frontCamera;
		this.backCamera = backCamera;
		this.processorName = processorName;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNetworkTechnology() {
		return networkTechnology;
	}


	public void setNetworkTechnology(String networkTechnology) {
		this.networkTechnology = networkTechnology;
	}


	public String getDisplayType() {
		return displayType;
	}


	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public int getResolution() {
		return resolution;
	}


	public void setResolution(int resolution) {
		this.resolution = resolution;
	}


	public boolean isAndroid() {
		return isAndroid;
	}


	public void setAndroid(boolean isAndroid) {
		this.isAndroid = isAndroid;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getRom() {
		return rom;
	}


	public void setRom(int rom) {
		this.rom = rom;
	}


	public boolean isAudioJackAvilable() {
		return isAudioJackAvilable;
	}


	public void setAudioJackAvilable(boolean isAudioJackAvilable) {
		this.isAudioJackAvilable = isAudioJackAvilable;
	}


	public int getBattryInMah() {
		return battryInMah;
	}


	public void setBattryInMah(int battryInMah) {
		this.battryInMah = battryInMah;
	}

	public int getFrontCamera() {
		return frontCamera;
	}


	public void setFrontCamera(int frontCamera) {
		this.frontCamera = frontCamera;
	}


	public int getBackCamera() {
		return backCamera;
	}


	public void setBackCamera(int backCamera) {
		this.backCamera = backCamera;
	}


	public String getProcessorName() {
		return processorName;
	}


	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mobile Details [name=" + name + ", networkTechnology=" + networkTechnology + ", displayType=" + displayType
				+ ", resolution=" + resolution + ", isAndroid=" + isAndroid + ", ram=" + ram + ", rom=" + rom
				+ ", isAudioJackAvilable=" + isAudioJackAvilable + ", battryInMah=" + battryInMah + ", frontCamera="
				+ frontCamera + ", backCamera=" + backCamera + ", processorName=" + processorName + ", price=" + price
				+ "]";
	}
	
	
	
	
	
}
