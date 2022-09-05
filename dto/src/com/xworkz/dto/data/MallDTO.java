package com.xworkz.dto.data;

import java.io.Serializable;

public class MallDTO implements Serializable {
	private String name;
	private String ownerName;
	private int ageOfOwner;
	private double builtUpArea;
	private boolean parking;
	private int noOfFloors;
	private int noOfShops;
	private int noOfLifts;
	private int noOfEscalators;
	private int noOfSteps;

	private String gstNo;
	private String pincode;
	private String country;
	private String state;
	private String city;
	private int noOfParkingFloors;
	private boolean kfc;
	private boolean cinepolis;
	private boolean gameZone;
	private boolean mcDonald;

	private boolean tatooStore;
	private boolean goldShop;
	private boolean noMensClothingShop;
	private boolean noWomensClothingShop;
	private int noOfBasementFloors;
	private boolean giftShops;
	private boolean iceCreamParlour;
	private boolean groceries;
	private double openTime;
	private double closeTime;

	private int noOfEntranceGates;
	private int noOfSecurity;
	private int noOfHouseKeeping;
	private boolean superMarket;
	private int noOfFoodCourts;
	private int noOfLights;
	private int noOfFans;
	private boolean ac;
	private boolean fireFighting;
	private int noOfDoors;

	private int noOfVentilators;
	private int noOfAcDucts;
	private double priceOfDoor;
	private double priceOfBulb;
	private double priceOfFan;

	public MallDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {
		return 45;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof MallDTO) {
				MallDTO c = (MallDTO) obj;
				if (c.name.equals(this.name) && c.ownerName.equals(this.ownerName)) {
					System.out.println(this.name + " & " + this.ownerName);
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAgeOfOwner() {
		return ageOfOwner;
	}

	public void setAgeOfOwner(int ageOfOwner) {
		this.ageOfOwner = ageOfOwner;
	}

	public double getBuiltUpArea() {
		return builtUpArea;
	}

	public void setBuiltUpArea(double builtUpArea) {
		this.builtUpArea = builtUpArea;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public int getNoOfShops() {
		return noOfShops;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

	public int getNoOfLifts() {
		return noOfLifts;
	}

	public void setNoOfLifts(int noOfLifts) {
		this.noOfLifts = noOfLifts;
	}

	public int getNoOfEscalators() {
		return noOfEscalators;
	}

	public void setNoOfEscalators(int noOfEscalators) {
		this.noOfEscalators = noOfEscalators;
	}

	public int getNoOfSteps() {
		return noOfSteps;
	}

	public void setNoOfSteps(int noOfSteps) {
		this.noOfSteps = noOfSteps;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
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

	public int getNoOfParkingFloors() {
		return noOfParkingFloors;
	}

	public void setNoOfParkingFloors(int noOfParkingFloors) {
		this.noOfParkingFloors = noOfParkingFloors;
	}

	public boolean isKfc() {
		return kfc;
	}

	public void setKfc(boolean kfc) {
		this.kfc = kfc;
	}

	public boolean isCinepolis() {
		return cinepolis;
	}

	public void setCinepolis(boolean cinepolis) {
		this.cinepolis = cinepolis;
	}

	public boolean isGameZone() {
		return gameZone;
	}

	public void setGameZone(boolean gameZone) {
		this.gameZone = gameZone;
	}

	public boolean isMcDonald() {
		return mcDonald;
	}

	public void setMcDonald(boolean mcDonald) {
		this.mcDonald = mcDonald;
	}

	public boolean isTatooStore() {
		return tatooStore;
	}

	public void setTatooStore(boolean tatooStore) {
		this.tatooStore = tatooStore;
	}

	public boolean isGoldShop() {
		return goldShop;
	}

	public void setGoldShop(boolean goldShop) {
		this.goldShop = goldShop;
	}

	public boolean isNoMensClothingShop() {
		return noMensClothingShop;
	}

	public void setNoMensClothingShop(boolean noMensClothingShop) {
		this.noMensClothingShop = noMensClothingShop;
	}

	public boolean isNoWomensClothingShop() {
		return noWomensClothingShop;
	}

	public void setNoWomensClothingShop(boolean noWomensClothingShop) {
		this.noWomensClothingShop = noWomensClothingShop;
	}

	public int getNoOfBasementFloors() {
		return noOfBasementFloors;
	}

	public void setNoOfBasementFloors(int noOfBasementFloors) {
		this.noOfBasementFloors = noOfBasementFloors;
	}

	public boolean isGiftShops() {
		return giftShops;
	}

	public void setGiftShops(boolean giftShops) {
		this.giftShops = giftShops;
	}

	public boolean isIceCreamParlour() {
		return iceCreamParlour;
	}

	public void setIceCreamParlour(boolean iceCreamParlour) {
		this.iceCreamParlour = iceCreamParlour;
	}

	public boolean isGroceries() {
		return groceries;
	}

	public void setGroceries(boolean groceries) {
		this.groceries = groceries;
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

	public int getNoOfEntranceGates() {
		return noOfEntranceGates;
	}

	public void setNoOfEntranceGates(int noOfEntranceGates) {
		this.noOfEntranceGates = noOfEntranceGates;
	}

	public int getNoOfSecurity() {
		return noOfSecurity;
	}

	public void setNoOfSecurity(int noOfSecurity) {
		this.noOfSecurity = noOfSecurity;
	}

	public int getNoOfHouseKeeping() {
		return noOfHouseKeeping;
	}

	public void setNoOfHouseKeeping(int noOfHouseKeeping) {
		this.noOfHouseKeeping = noOfHouseKeeping;
	}

	public boolean isSuperMarket() {
		return superMarket;
	}

	public void setSuperMarket(boolean superMarket) {
		this.superMarket = superMarket;
	}

	public int getNoOfFoodCourts() {
		return noOfFoodCourts;
	}

	public void setNoOfFoodCourts(int noOfFoodCourts) {
		this.noOfFoodCourts = noOfFoodCourts;
	}

	public int getNoOfLights() {
		return noOfLights;
	}

	public void setNoOfLights(int noOfLights) {
		this.noOfLights = noOfLights;
	}

	public int getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(int noOfFans) {
		this.noOfFans = noOfFans;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public boolean isFireFighting() {
		return fireFighting;
	}

	public void setFireFighting(boolean fireFighting) {
		this.fireFighting = fireFighting;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfVentilators() {
		return noOfVentilators;
	}

	public void setNoOfVentilators(int noOfVentilators) {
		this.noOfVentilators = noOfVentilators;
	}

	public int getNoOfAcDucts() {
		return noOfAcDucts;
	}

	public void setNoOfAcDucts(int noOfAcDucts) {
		this.noOfAcDucts = noOfAcDucts;
	}

	public double getPriceOfDoor() {
		return priceOfDoor;
	}

	public void setPriceOfDoor(double priceOfDoor) {
		this.priceOfDoor = priceOfDoor;
	}

	public double getPriceOfBulb() {
		return priceOfBulb;
	}

	public void setPriceOfBulb(double priceOfBulb) {
		this.priceOfBulb = priceOfBulb;
	}

	public double getPriceOfFan() {
		return priceOfFan;
	}

	public void setPriceOfFan(double priceOfFan) {
		this.priceOfFan = priceOfFan;
	}
	
	

}
