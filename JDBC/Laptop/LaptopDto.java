package com.class_1_dec_20.task_2_laptop;

import lombok.Getter;
import lombok.Setter;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@Getter
@Setter
public class LaptopDto {

	private String brandName;
	private String color;
	private String model;
	private String processorName;
	private int ramCapacity;
	private int romCapacity;
	private boolean extenRam;
	private boolean ectendRom;
	private float displaySize;
	private boolean isFingerPrintUnlock;
	private boolean backliteKeyboard;
	private boolean touchScreen;
	private float maxClockSpeed;
	private String suitablefor;
	private boolean graphicCardAvilable;
	private int price;
	
	public LaptopDto() {
		System.out.println("Deflut constructor");
	}	
	
	public LaptopDto(String brandName, String color, String model, String processorName, int ramCapacity,
			int romCapacity, boolean extenRam, boolean ectendRom, float displaySize, boolean isFingerPrintUnlock,
			boolean backliteKeyboard, boolean touchScreen, float maxClockSpeed, String suitablefor,
			boolean graphicCardAvilable, int price) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.model = model;
		this.processorName = processorName;
		this.ramCapacity = ramCapacity;
		this.romCapacity = romCapacity;
		this.extenRam = extenRam;
		this.ectendRom = ectendRom;
		this.displaySize = displaySize;
		this.isFingerPrintUnlock = isFingerPrintUnlock;
		this.backliteKeyboard = backliteKeyboard;
		this.touchScreen = touchScreen;
		this.maxClockSpeed = maxClockSpeed;
		this.suitablefor = suitablefor;
		this.graphicCardAvilable = graphicCardAvilable;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessorName() {
		return processorName;
	}
	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}
	public int getRamCapacity() {
		return ramCapacity;
	}
	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	public int getRomCapacity() {
		return romCapacity;
	}
	public void setRomCapacity(int romCapacity) {
		this.romCapacity = romCapacity;
	}
	public boolean isExtenRam() {
		return extenRam;
	}
	public void setExtenRam(boolean extenRam) {
		this.extenRam = extenRam;
	}
	public boolean isEctendRom() {
		return ectendRom;
	}
	public void setEctendRom(boolean ectendRom) {
		this.ectendRom = ectendRom;
	}
	public float getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(float displaySize) {
		this.displaySize = displaySize;
	}
	public boolean isFingerPrintUnlock() {
		return isFingerPrintUnlock;
	}
	public void setFingerPrintUnlock(boolean isFingerPrintUnlock) {
		this.isFingerPrintUnlock = isFingerPrintUnlock;
	}
	public boolean isBackliteKeyboard() {
		return backliteKeyboard;
	}
	public void setBackliteKeyboard(boolean backliteKeyboard) {
		this.backliteKeyboard = backliteKeyboard;
	}
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	public float getMaxClockSpeed() {
		return maxClockSpeed;
	}
	public void setMaxClockSpeed(float maxClockSpeed) {
		this.maxClockSpeed = maxClockSpeed;
	}
	public String getSuitablefor() {
		return suitablefor;
	}
	public void setSuitablefor(String suitablefor) {
		this.suitablefor = suitablefor;
	}
	public boolean isGraphicCardAvilable() {
		return graphicCardAvilable;
	}
	public void setGraphicCardAvilable(boolean graphicCardAvilable) {
		this.graphicCardAvilable = graphicCardAvilable;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LaptopDto [brandName=" + brandName + ", color=" + color + ", model=" + model + ", processorName="
				+ processorName + ", ramCapacity=" + ramCapacity + ", romCapacity=" + romCapacity + ", extenRam="
				+ extenRam + ", ectendRom=" + ectendRom + ", displaySize=" + displaySize + ", isFingerPrintUnlock="
				+ isFingerPrintUnlock + ", backliteKeyboard=" + backliteKeyboard + ", touchScreen=" + touchScreen
				+ ", maxClockSpeed=" + maxClockSpeed + ", suitablefor=" + suitablefor + ", graphicCardAvilable="
				+ graphicCardAvilable + ", price=" + price + "]";
	}
	
	
	
}
