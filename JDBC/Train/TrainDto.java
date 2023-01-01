 package com.class_1_dec_20.task;
 
public class TrainDto {

	private int slNo;
	private int trainNo;
	private String name;
	private int numberOfStops;
	private int distance;
	private String startLoc;
	private String endLoc;
	private int totalPassangersCapacity;
	private boolean offlineTicketAvilable;
	private boolean sleeperCoachAvilable;
	private boolean acCoachAvilable;
	private int numberOfCoaches;
	private String travellHours;
	private String trainTopSpeed;
	private int ticketPrice;
	
	public TrainDto() {
	}

	public TrainDto(int slNo, int trainNo, String name, int numberOfStops, int distance, String startLoc, String endLoc,
			int totalPassangersCapacity, boolean offlineTicketAvilable, boolean sleeperCoachAvilable,
			boolean acCoachAvilable, int numberOfCoaches, String travellHours, String trainTopSpeed, int ticketPrice) {
		super();
		this.slNo = slNo;
		this.trainNo = trainNo;
		this.name = name;
		this.numberOfStops = numberOfStops;
		this.distance = distance;
		this.startLoc = startLoc;
		this.endLoc = endLoc;
		this.totalPassangersCapacity = totalPassangersCapacity;
		this.offlineTicketAvilable = offlineTicketAvilable;
		this.sleeperCoachAvilable = sleeperCoachAvilable;
		this.acCoachAvilable = acCoachAvilable;
		this.numberOfCoaches = numberOfCoaches;
		this.travellHours = travellHours;
		this.trainTopSpeed = trainTopSpeed;
		this.ticketPrice = ticketPrice;
	}



	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getStartLoc() {
		return startLoc;
	}

	public void setStartLoc(String startLoc) {
		this.startLoc = startLoc;
	}

	public String getEndLoc() {
		return endLoc;
	}

	public void setEndLoc(String endLoc) {
		this.endLoc = endLoc;
	}

	public int getTotalPassangersCapacity() {
		return totalPassangersCapacity;
	}

	public void setTotalPassangersCapacity(int totalPassangersCapacity) {
		this.totalPassangersCapacity = totalPassangersCapacity;
	}

	public boolean isOfflineTicketAvilable() {
		return offlineTicketAvilable;
	}

	public void setOfflineTicketAvilable(boolean offlineTicketAvilable) {
		this.offlineTicketAvilable = offlineTicketAvilable;
	}

	public boolean isSleeperCoachAvilable() {
		return sleeperCoachAvilable;
	}

	public void setSleeperCoachAvilable(boolean sleeperCoachAvilable) {
		this.sleeperCoachAvilable = sleeperCoachAvilable;
	}

	public boolean isAcCoachAvilable() {
		return acCoachAvilable;
	}

	public void setAcCoachAvilable(boolean acCoachAvilable) {
		this.acCoachAvilable = acCoachAvilable;
	}

	public int getNumberOfCoaches() {
		return numberOfCoaches;
	}

	public void setNumberOfCoaches(int numberOfCoaches) {
		this.numberOfCoaches = numberOfCoaches;
	}

	public String getTravellHours() {
		return travellHours;
	}

	public void setTravellHours(String travellHours) {
		this.travellHours = travellHours;
	}

	public String getTrainTopSpeed() {
		return trainTopSpeed;
	}

	public void setTrainTopSpeed(String trainTopSpeed) {
		this.trainTopSpeed = trainTopSpeed;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "TrainDto [slNo=" + slNo + ", trainNo=" + trainNo + ", name=" + name + ", numberOfStops=" + numberOfStops
				+ ", distance=" + distance + ", startLoc=" + startLoc + ", endLoc=" + endLoc
				+ ", totalPassangersCapacity=" + totalPassangersCapacity + ", offlineTicketAvilable="
				+ offlineTicketAvilable + ", sleeperCoachAvilable=" + sleeperCoachAvilable + ", acCoachAvilable="
				+ acCoachAvilable + ", numberOfCoaches=" + numberOfCoaches + ", travellHours=" + travellHours
				+ ", trainTopSpeed=" + trainTopSpeed + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
}
