package com.xworkz.games.gamesDto;

public class GamesDto {

	private String gameName;
	private int noOfPlayer;
	private double totalGameTime;
	private boolean isIndoore;
	private String gtratestOfAllTimePlayer;
	
	
	public GamesDto(String gameName, int noOfPlayer, double totalGameTime, boolean isIndoore,
			String gtratestOfAllTimePlayer) {
		super();
		this.gameName = gameName;
		this.noOfPlayer = noOfPlayer;
		this.totalGameTime = totalGameTime;
		this.isIndoore = isIndoore;
		this.gtratestOfAllTimePlayer = gtratestOfAllTimePlayer;
	}


	public GamesDto() {
		
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public int getNoOfPlayer() {
		return noOfPlayer;
	}


	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}


	public double getTotalGameTime() {
		return totalGameTime;
	}


	public void setTotalGameTime(double totalGameTime) {
		this.totalGameTime = totalGameTime;
	}


	public boolean isIndoore() {
		return isIndoore;
	}


	public void setIndoore(boolean isIndoore) {
		this.isIndoore = isIndoore;
	}


	public String getGtratestOfAllTimePlayer() {
		return gtratestOfAllTimePlayer;
	}


	public void setGtratestOfAllTimePlayer(String gtratestOfAllTimePlayer) {
		this.gtratestOfAllTimePlayer = gtratestOfAllTimePlayer;
	}


	@Override
	public String toString() {
		return "GamesDto [gameName=" + gameName + ", noOfPlayer=" + noOfPlayer + ", totalGameTime=" + totalGameTime
				+ ", isIndoore=" + isIndoore + ", gtratestOfAllTimePlayer=" + gtratestOfAllTimePlayer + "]";
	}
	
	
}
