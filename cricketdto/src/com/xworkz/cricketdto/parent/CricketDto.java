package com.xworkz.cricketdto.parent;

public class CricketDto {
	private String country;
	private String type;
	private String nameOfCaptain;
	private int noOfPlayers;
	private String nameOfStadium;
	private char gender;
	private int noOfBatsmans;
	private int noOfBowlers;
	private int noOfAllrounders;
	private int noOfOvers;

	public CricketDto() {
		System.out.println("Default constructor");
	}

	public CricketDto(String country, String type, String nameOfCaptain, int noOfPlayers, String nameOfStadium,
			char gender, int noOfBatsmans, int noOfBowlers, int noOfAllrounders, int noOfOvers) {
		super();
		this.country = country;
		this.type = type;
		this.nameOfCaptain = nameOfCaptain;
		this.noOfPlayers = noOfPlayers;
		this.nameOfStadium = nameOfStadium;
		this.gender = gender;
		this.noOfBatsmans = noOfBatsmans;
		this.noOfBowlers = noOfBowlers;
		this.noOfAllrounders = noOfAllrounders;
		this.noOfOvers = noOfOvers;
	}

	@Override
	public String toString() {
		return "CricketDto [country=" + country + ", type=" + type + ", nameOfCaptain=" + nameOfCaptain
				+ ", noOfPlayers=" + noOfPlayers + ", nameOfStadium=" + nameOfStadium + ", gender=" + gender
				+ ", noOfBatsmans=" + noOfBatsmans + ", noOfBowlers=" + noOfBowlers + ", noOfAllrounders="
				+ noOfAllrounders + ", noOfOvers=" + noOfOvers + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNameOfCaptain() {
		return nameOfCaptain;
	}

	public void setNameOfCaptain(String nameOfCaptain) {
		this.nameOfCaptain = nameOfCaptain;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getNameOfStadium() {
		return nameOfStadium;
	}

	public void setNameOfStadium(String nameOfStadium) {
		this.nameOfStadium = nameOfStadium;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getNoOfBatsmans() {
		return noOfBatsmans;
	}

	public void setNoOfBatsmans(int noOfBatsmans) {
		this.noOfBatsmans = noOfBatsmans;
	}

	public int getNoOfBowlers() {
		return noOfBowlers;
	}

	public void setNoOfBowlers(int noOfBowlers) {
		this.noOfBowlers = noOfBowlers;
	}

	public int getNoOfAllrounders() {
		return noOfAllrounders;
	}

	public void setNoOfAllrounders(int noOfAllrounders) {
		this.noOfAllrounders = noOfAllrounders;
	}

	public int getNoOfOvers() {
		return noOfOvers;
	}

	public void setNoOfOvers(int noOfOvers) {
		this.noOfOvers = noOfOvers;
	}

}
