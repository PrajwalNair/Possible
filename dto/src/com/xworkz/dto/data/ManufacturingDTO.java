package com.xworkz.dto.data;

import java.io.Serializable;

public class ManufacturingDTO implements Serializable {
	private String product;
	private String type;
	private String location;
	private String country;
	private String state;
	private String city;
	private String builtUpArea;
	private boolean parking;
	private int noOfParkingSlots;
	private int noOfGates;

	private double openTime;
	private double close;
	private int noOfRooms;
	private boolean cateen;
	private boolean bathRoom;
	private boolean gentsToilet;
	private double lunchTime;
	private double teaTime;
	private int noOfShifts;
	private int noOfMachines;

	private int noOfDoors;
	private int noOfWindow;
	private double priceOfDoor;
	private double priceOfWindow;
	private double widthOfDoor;
	private double heightOfWindow;
	private String colorOfDoor;
	private String colorOfWindow;
	private double widthOfGate;
	private double heightOfGate;

	private String materialUsedForDoor;
	private String materialUsedForWindow;
	private String materialUsedForGate;
	private int noOfWorkers;
	private int noOfStaffs;
	private int noOfManager;
	private String nameOfManager;
	private int ageOfManager;
	private char genderOfManager;
	private String qualificationOfManager;

	private double costOfMachines;
	private int noOfLigths;
	private int noOfFans;
	private int noOfComodes;
	private int noOfWashBasins;

	public ManufacturingDTO() {
		System.out.println("Default constructor");
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBuiltUpArea() {
		return builtUpArea;
	}

	public void setBuiltUpArea(String builtUpArea) {
		this.builtUpArea = builtUpArea;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public int getNoOfParkingSlots() {
		return noOfParkingSlots;
	}

	public void setNoOfParkingSlots(int noOfParkingSlots) {
		this.noOfParkingSlots = noOfParkingSlots;
	}

	public int getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}

	public double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public boolean isCateen() {
		return cateen;
	}

	public void setCateen(boolean cateen) {
		this.cateen = cateen;
	}

	public boolean isBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(boolean bathRoom) {
		this.bathRoom = bathRoom;
	}

	public boolean isGentsToilet() {
		return gentsToilet;
	}

	public void setGentsToilet(boolean gentsToilet) {
		this.gentsToilet = gentsToilet;
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

	public int getNoOfShifts() {
		return noOfShifts;
	}

	public void setNoOfShifts(int noOfShifts) {
		this.noOfShifts = noOfShifts;
	}

	public int getNoOfMachines() {
		return noOfMachines;
	}

	public void setNoOfMachines(int noOfMachines) {
		this.noOfMachines = noOfMachines;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWindow() {
		return noOfWindow;
	}

	public void setNoOfWindow(int noOfWindow) {
		this.noOfWindow = noOfWindow;
	}

	public double getPriceOfDoor() {
		return priceOfDoor;
	}

	public void setPriceOfDoor(double priceOfDoor) {
		this.priceOfDoor = priceOfDoor;
	}

	public double getPriceOfWindow() {
		return priceOfWindow;
	}

	public void setPriceOfWindow(double priceOfWindow) {
		this.priceOfWindow = priceOfWindow;
	}

	public double getWidthOfDoor() {
		return widthOfDoor;
	}

	public void setWidthOfDoor(double widthOfDoor) {
		this.widthOfDoor = widthOfDoor;
	}

	public double getHeightOfWindow() {
		return heightOfWindow;
	}

	public void setHeightOfWindow(double heightOfWindow) {
		this.heightOfWindow = heightOfWindow;
	}

	public String getColorOfDoor() {
		return colorOfDoor;
	}

	public void setColorOfDoor(String colorOfDoor) {
		this.colorOfDoor = colorOfDoor;
	}

	public String getColorOfWindow() {
		return colorOfWindow;
	}

	public void setColorOfWindow(String colorOfWindow) {
		this.colorOfWindow = colorOfWindow;
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

	public String getMaterialUsedForDoor() {
		return materialUsedForDoor;
	}

	public void setMaterialUsedForDoor(String materialUsedForDoor) {
		this.materialUsedForDoor = materialUsedForDoor;
	}

	public String getMaterialUsedForWindow() {
		return materialUsedForWindow;
	}

	public void setMaterialUsedForWindow(String materialUsedForWindow) {
		this.materialUsedForWindow = materialUsedForWindow;
	}

	public String getMaterialUsedForGate() {
		return materialUsedForGate;
	}

	public void setMaterialUsedForGate(String materialUsedForGate) {
		this.materialUsedForGate = materialUsedForGate;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public int getNoOfManager() {
		return noOfManager;
	}

	public void setNoOfManager(int noOfManager) {
		this.noOfManager = noOfManager;
	}

	public String getNameOfManager() {
		return nameOfManager;
	}

	public void setNameOfManager(String nameOfManager) {
		this.nameOfManager = nameOfManager;
	}

	public int getAgeOfManager() {
		return ageOfManager;
	}

	public void setAgeOfManager(int ageOfManager) {
		this.ageOfManager = ageOfManager;
	}

	public char getGenderOfManager() {
		return genderOfManager;
	}

	public void setGenderOfManager(char genderOfManager) {
		this.genderOfManager = genderOfManager;
	}

	public String getQualificationOfManager() {
		return qualificationOfManager;
	}

	public void setQualificationOfManager(String qualificationOfManager) {
		this.qualificationOfManager = qualificationOfManager;
	}

	public double getCostOfMachines() {
		return costOfMachines;
	}

	public void setCostOfMachines(double costOfMachines) {
		this.costOfMachines = costOfMachines;
	}

	public int getNoOfLigths() {
		return noOfLigths;
	}

	public void setNoOfLigths(int noOfLigths) {
		this.noOfLigths = noOfLigths;
	}

	public int getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(int noOfFans) {
		this.noOfFans = noOfFans;
	}

	public int getNoOfComodes() {
		return noOfComodes;
	}

	public void setNoOfComodes(int noOfComodes) {
		this.noOfComodes = noOfComodes;
	}

	public int getNoOfWashBasins() {
		return noOfWashBasins;
	}

	public void setNoOfWashBasins(int noOfWashBasins) {
		this.noOfWashBasins = noOfWashBasins;
	}

}
