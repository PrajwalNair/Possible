package com.xworkz.dto.data;

import java.io.Serializable;

public class VillaDTO implements Serializable {
	private String name;
	private String type;
	private String country;
	private String state;
	private String city;
	private boolean garden;
	private boolean swimmingPool;
	private boolean terraceGarden;
	private int noOfWorkers;
	private int noOfAc;

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
	private boolean gentsToilet;
	private boolean ladiesToilet;
	private double widthOfDoor;
	private double heightOfDoor;
	private double widthOfGate;
	private double heightOfGate;
	private boolean security;

	private String securityName;
	private double priceOfAc;
	private String typeOfAc;
	private boolean ac;
	private boolean fan;

	public VillaDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 9;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof VillaDTO) {
				VillaDTO c = (VillaDTO) obj;
				if (c.fan == (this.fan) && c.ac == (this.ac) && c.typeOfAc == (this.typeOfAc)
						&& c.priceOfAc == (this.priceOfAc) && c.securityName == (this.securityName)
						&& c.security == (this.security) && c.noOfchairs == (this.noOfchairs)
						&& c.noOfDoors == (this.noOfDoors) && c.noOfFans == (this.noOfFans)
						&& c.noOfTables == (this.noOfTables) && c.noOfLights == (this.noOfLights)
						&& c.noOfRooms == (this.noOfRooms) && c.priceOfChairs == (this.priceOfChairs)
						&& c.priceOfTables == (this.priceOfTables) && c.priceOfFans == (this.priceOfFans)
						&& c.priceOfWindow == (this.priceOfWindow)) {
					System.out.println(this.fan + " & " + this.ac + " & " + this.typeOfAc + " & " + this.priceOfAc
							+ " & " + this.securityName + " & " + this.security + " & " + this.noOfchairs + " & "
							+ this.noOfDoors + " & " + this.noOfFans + " & " + this.noOfTables + " & " + this.noOfLights
							+ " & " + this.priceOfAc + " & " + this.priceOfChairs + " & " + this.priceOfTables + " & "
							+ this.priceOfFans + " & " + this.priceOfWindow);
					return true;
				} else {
					System.err.println("it is not equal");
				}
			} else {
				System.err.println("it is not instanceof");
			}
		}
		return super.equals(obj);

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

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public boolean isSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	public boolean isTerraceGarden() {
		return terraceGarden;
	}

	public void setTerraceGarden(boolean terraceGarden) {
		this.terraceGarden = terraceGarden;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public int getNoOfAc() {
		return noOfAc;
	}

	public void setNoOfAc(int noOfAc) {
		this.noOfAc = noOfAc;
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

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public double getPriceOfAc() {
		return priceOfAc;
	}

	public void setPriceOfAc(double priceOfAc) {
		this.priceOfAc = priceOfAc;
	}

	public String getTypeOfAc() {
		return typeOfAc;
	}

	public void setTypeOfAc(String typeOfAc) {
		this.typeOfAc = typeOfAc;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public boolean isFan() {
		return fan;
	}

	public void setFan(boolean fan) {
		this.fan = fan;
	}

}
