package com.xworkz.dto.data;

import java.io.Serializable;

public class HospitalDTO implements Serializable {
	private String name;
	private String type;
	private double openTime;
	private double closeTime;
	private String country;
	private String state;
	private String city;
	private String area;
	private int pincode;
	private double registrationFees;

	private int noOfDoctors;
	private int noOfNurse;
	private int noOfAccountants;
	private int noOfReciptionist;
	private String nameOfReceiptionist;
	private int noOfPatients;
	private int noOfMaleDoctors;
	private int noOfFemaleDoctors;
	private int noOfHouseKeepers;
	private int noOfBrothers;

	private int noOfcots;
	private int noOfBeds;
	private int noOfChairs;
	private int noOfFans;
	private int noOfStretchers;
	private int noOfWheelChairs;
	private int noOfoperationTheatres;
	private int noOfRooms;
	private int noOficu;
	private int noOfSpecialRooms;

	private double priceOfCot;
	private double priceOfBed;
	private double priceOfChair;
	private double priceOfFan;
	private double priceOfStretcher;
	private double priceOfWheelChair;
	private boolean fireFighting;
	private String ownersName;
	private int ageOfOwner;
	private double netWorth;

	private int noOfTables;
	private int noOfEntranceGates;
	private int noOfDoors;
	private int noOfWindows;
	private int noOfGeneralWards;

	public HospitalDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 65;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof HospitalDTO) {
				HospitalDTO c = (HospitalDTO) obj;
				if (c.name.equals(this.name) && c.type.equals(this.type)) {
					System.out.println(this.name + " & " + this.type);
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public double getRegistrationFees() {
		return registrationFees;
	}

	public void setRegistrationFees(double registrationFees) {
		this.registrationFees = registrationFees;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public int getNoOfNurse() {
		return noOfNurse;
	}

	public void setNoOfNurse(int noOfNurse) {
		this.noOfNurse = noOfNurse;
	}

	public int getNoOfAccountants() {
		return noOfAccountants;
	}

	public void setNoOfAccountants(int noOfAccountants) {
		this.noOfAccountants = noOfAccountants;
	}

	public int getNoOfReciptionist() {
		return noOfReciptionist;
	}

	public void setNoOfReciptionist(int noOfReciptionist) {
		this.noOfReciptionist = noOfReciptionist;
	}

	public String getNameOfReceiptionist() {
		return nameOfReceiptionist;
	}

	public void setNameOfReceiptionist(String nameOfReceiptionist) {
		this.nameOfReceiptionist = nameOfReceiptionist;
	}

	public int getNoOfPatients() {
		return noOfPatients;
	}

	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}

	public int getNoOfMaleDoctors() {
		return noOfMaleDoctors;
	}

	public void setNoOfMaleDoctors(int noOfMaleDoctors) {
		this.noOfMaleDoctors = noOfMaleDoctors;
	}

	public int getNoOfFemaleDoctors() {
		return noOfFemaleDoctors;
	}

	public void setNoOfFemaleDoctors(int noOfFemaleDoctors) {
		this.noOfFemaleDoctors = noOfFemaleDoctors;
	}

	public int getNoOfHouseKeepers() {
		return noOfHouseKeepers;
	}

	public void setNoOfHouseKeepers(int noOfHouseKeepers) {
		this.noOfHouseKeepers = noOfHouseKeepers;
	}

	public int getNoOfBrothers() {
		return noOfBrothers;
	}

	public void setNoOfBrothers(int noOfBrothers) {
		this.noOfBrothers = noOfBrothers;
	}

	public int getNoOfcots() {
		return noOfcots;
	}

	public void setNoOfcots(int noOfcots) {
		this.noOfcots = noOfcots;
	}

	public int getNoOfBeds() {
		return noOfBeds;
	}

	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public int getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(int noOfFans) {
		this.noOfFans = noOfFans;
	}

	public int getNoOfStretchers() {
		return noOfStretchers;
	}

	public void setNoOfStretchers(int noOfStretchers) {
		this.noOfStretchers = noOfStretchers;
	}

	public int getNoOfWheelChairs() {
		return noOfWheelChairs;
	}

	public void setNoOfWheelChairs(int noOfWheelChairs) {
		this.noOfWheelChairs = noOfWheelChairs;
	}

	public int getNoOfoperationTheatres() {
		return noOfoperationTheatres;
	}

	public void setNoOfoperationTheatres(int noOfoperationTheatres) {
		this.noOfoperationTheatres = noOfoperationTheatres;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOficu() {
		return noOficu;
	}

	public void setNoOficu(int noOficu) {
		this.noOficu = noOficu;
	}

	public int getNoOfSpecialRooms() {
		return noOfSpecialRooms;
	}

	public void setNoOfSpecialRooms(int noOfSpecialRooms) {
		this.noOfSpecialRooms = noOfSpecialRooms;
	}

	public double getPriceOfCot() {
		return priceOfCot;
	}

	public void setPriceOfCot(double priceOfCot) {
		this.priceOfCot = priceOfCot;
	}

	public double getPriceOfBed() {
		return priceOfBed;
	}

	public void setPriceOfBed(double priceOfBed) {
		this.priceOfBed = priceOfBed;
	}

	public double getPriceOfChair() {
		return priceOfChair;
	}

	public void setPriceOfChair(double priceOfChair) {
		this.priceOfChair = priceOfChair;
	}

	public double getPriceOfFan() {
		return priceOfFan;
	}

	public void setPriceOfFan(double priceOfFan) {
		this.priceOfFan = priceOfFan;
	}

	public double getPriceOfStretcher() {
		return priceOfStretcher;
	}

	public void setPriceOfStretcher(double priceOfStretcher) {
		this.priceOfStretcher = priceOfStretcher;
	}

	public double getPriceOfWheelChair() {
		return priceOfWheelChair;
	}

	public void setPriceOfWheelChair(double priceOfWheelChair) {
		this.priceOfWheelChair = priceOfWheelChair;
	}

	public boolean isFireFighting() {
		return fireFighting;
	}

	public void setFireFighting(boolean fireFighting) {
		this.fireFighting = fireFighting;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public int getAgeOfOwner() {
		return ageOfOwner;
	}

	public void setAgeOfOwner(int ageOfOwner) {
		this.ageOfOwner = ageOfOwner;
	}

	public double getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}

	public int getNoOfEntranceGates() {
		return noOfEntranceGates;
	}

	public void setNoOfEntranceGates(int noOfEntranceGates) {
		this.noOfEntranceGates = noOfEntranceGates;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWindows() {
		return noOfWindows;
	}

	public void setNoOfWindows(int noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public int getNoOfGeneralWards() {
		return noOfGeneralWards;
	}

	public void setNoOfGeneralWards(int noOfGeneralWards) {
		this.noOfGeneralWards = noOfGeneralWards;
	}

}
