package com.xworkz.dto.data;

import java.io.Serializable;

public class UniversityDTO implements Serializable {
	private String name;
	private String type;
	private String founder;
	private String Chancellor;
	private String viceChancellor;
	private String College;
	private String principal;
	private int noOfchairs;
	private int noOfTables;
	private int noOfFans;

	private int noOfLights;
	private int noOfBells;
	private double openTime;
	private double closeTime;
	private double priceOfChairs;
	private double priceOfTables;
	private double priceOfFans;
	private double priceOfLights;
	private double noOfRooms;
	private double noOfBathRooms;

	private boolean gentsToilet;
	private boolean ladiesToilet;
	private boolean canteen;
	private double lunchTime;
	private double teaTime;
	private int noOfLectures;
	private int noOfHod;
	private int noOfTrees;
	private int noOfStreams;
	private boolean garden;

	private int noOfMainDoors;
	private int noOfGates;
	private int noOfDoors;
	private String typeOfDoors;
	private String typeOfGates;
	private double priceOfDoor;
	private double priceOfGates;
	private double priceOfWindow;
	private double widthOfMainDoor;
	private double heightOfMainDoor;

	private double widthOfDoor;
	private double heightOfDoor;
	private double widthOfGate;
	private double heightOfGate;
	private boolean security;

	public UniversityDTO() {
		System.out.println("Default constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getChancellor() {
		return Chancellor;
	}

	public void setChancellor(String chancellor) {
		Chancellor = chancellor;
	}

	public String getViceChancellor() {
		return viceChancellor;
	}

	public void setViceChancellor(String viceChancellor) {
		this.viceChancellor = viceChancellor;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public int getNoOfchairs() {
		return noOfchairs;
	}

	public void setNoOfchairs(int noOfchairs) {
		this.noOfchairs = noOfchairs;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}

	public int getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(int noOfFans) {
		this.noOfFans = noOfFans;
	}

	public int getNoOfLights() {
		return noOfLights;
	}

	public void setNoOfLights(int noOfLights) {
		this.noOfLights = noOfLights;
	}

	public int getNoOfBells() {
		return noOfBells;
	}

	public void setNoOfBells(int noOfBells) {
		this.noOfBells = noOfBells;
	}

	public double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public double getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}

	public double getPriceOfChairs() {
		return priceOfChairs;
	}

	public void setPriceOfChairs(double priceOfChairs) {
		this.priceOfChairs = priceOfChairs;
	}

	public double getPriceOfTables() {
		return priceOfTables;
	}

	public void setPriceOfTables(double priceOfTables) {
		this.priceOfTables = priceOfTables;
	}

	public double getPriceOfFans() {
		return priceOfFans;
	}

	public void setPriceOfFans(double priceOfFans) {
		this.priceOfFans = priceOfFans;
	}

	public double getPriceOfLights() {
		return priceOfLights;
	}

	public void setPriceOfLights(double priceOfLights) {
		this.priceOfLights = priceOfLights;
	}

	public double getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(double noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public double getNoOfBathRooms() {
		return noOfBathRooms;
	}

	public void setNoOfBathRooms(double noOfBathRooms) {
		this.noOfBathRooms = noOfBathRooms;
	}

	public boolean isGentsToilet() {
		return gentsToilet;
	}

	public void setGentsToilet(boolean gentsToilet) {
		this.gentsToilet = gentsToilet;
	}

	public boolean isLadiesToilet() {
		return ladiesToilet;
	}

	public void setLadiesToilet(boolean ladiesToilet) {
		this.ladiesToilet = ladiesToilet;
	}

	public boolean isCanteen() {
		return canteen;
	}

	public void setCanteen(boolean canteen) {
		this.canteen = canteen;
	}

	public double getLunchTime() {
		return lunchTime;
	}

	public void setLunchTime(double lunchTime) {
		this.lunchTime = lunchTime;
	}

	public double getTeaTime() {
		return teaTime;
	}

	public void setTeaTime(double teaTime) {
		this.teaTime = teaTime;
	}

	public int getNoOfLectures() {
		return noOfLectures;
	}

	public void setNoOfLectures(int noOfLectures) {
		this.noOfLectures = noOfLectures;
	}

	public int getNoOfHod() {
		return noOfHod;
	}

	public void setNoOfHod(int noOfHod) {
		this.noOfHod = noOfHod;
	}

	public int getNoOfTrees() {
		return noOfTrees;
	}

	public void setNoOfTrees(int noOfTrees) {
		this.noOfTrees = noOfTrees;
	}

	public int getNoOfStreams() {
		return noOfStreams;
	}

	public void setNoOfStreams(int noOfStreams) {
		this.noOfStreams = noOfStreams;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public int getNoOfMainDoors() {
		return noOfMainDoors;
	}

	public void setNoOfMainDoors(int noOfMainDoors) {
		this.noOfMainDoors = noOfMainDoors;
	}

	public int getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public String getTypeOfDoors() {
		return typeOfDoors;
	}

	public void setTypeOfDoors(String typeOfDoors) {
		this.typeOfDoors = typeOfDoors;
	}

	public String getTypeOfGates() {
		return typeOfGates;
	}

	public void setTypeOfGates(String typeOfGates) {
		this.typeOfGates = typeOfGates;
	}

	public double getPriceOfDoor() {
		return priceOfDoor;
	}

	public void setPriceOfDoor(double priceOfDoor) {
		this.priceOfDoor = priceOfDoor;
	}

	public double getPriceOfGates() {
		return priceOfGates;
	}

	public void setPriceOfGates(double priceOfGates) {
		this.priceOfGates = priceOfGates;
	}

	public double getPriceOfWindow() {
		return priceOfWindow;
	}

	public void setPriceOfWindow(double priceOfWindow) {
		this.priceOfWindow = priceOfWindow;
	}

	public double getWidthOfMainDoor() {
		return widthOfMainDoor;
	}

	public void setWidthOfMainDoor(double widthOfMainDoor) {
		this.widthOfMainDoor = widthOfMainDoor;
	}

	public double getHeightOfMainDoor() {
		return heightOfMainDoor;
	}

	public void setHeightOfMainDoor(double heightOfMainDoor) {
		this.heightOfMainDoor = heightOfMainDoor;
	}

	public double getWidthOfDoor() {
		return widthOfDoor;
	}

	public void setWidthOfDoor(double widthOfDoor) {
		this.widthOfDoor = widthOfDoor;
	}

	public double getHeightOfDoor() {
		return heightOfDoor;
	}

	public void setHeightOfDoor(double heightOfDoor) {
		this.heightOfDoor = heightOfDoor;
	}

	public double getWidthOfGate() {
		return widthOfGate;
	}

	public void setWidthOfGate(double widthOfGate) {
		this.widthOfGate = widthOfGate;
	}

	public double getHeightOfGate() {
		return heightOfGate;
	}

	public void setHeightOfGate(double heightOfGate) {
		this.heightOfGate = heightOfGate;
	}

	public boolean isSecurity() {
		return security;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}

}
