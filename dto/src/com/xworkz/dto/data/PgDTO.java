package com.xworkz.dto.data;

import java.io.Serializable;

public class PgDTO implements Serializable {
	private String name;
	private String ownerName;
	private int ownerAge;
	private char gender;
	private int noOfPeopleStaying;
	private double rent;
	private double advanceAmount;
	private double rating;
	private int noOfRooms;
	private int noOfHouseKeeping;

	private String colonyName;
	private String area;
	private String city;
	private String state;
	private String breakFastTiming;
	private String lunchTimings;
	private String dinnerTimings;
	private int noOfFloors;
	private int totalNoOfRooms;
	private int noOfRoomsInGroundFloor;

	private int noOfRoomsInFirstFloor;
	private int noOfRoomsInSecondFloor;
	private int noOfRoomsInThirdFloor;
	private int noOfSharing;
	private int noOfDoors;
	private int totalNoOfFans;
	private int totalNoOfcots;
	private int totalNoOfBeds;
	private int totalNoOfChairs;
	private int totalNoOfWindows;

	private boolean lift;
	private int noOfSteps;
	private int noOfSolarHeaters;
	private int noOfTaps;
	private int noOfDrums;
	private int noOfDb;
	private boolean generator;
	private int noOfSwitches;
	private boolean ac;
	private String typeOfWindow;
	private String typeOfDoor;

	private int noOfCodes;
	private int noOfWashBasins;
	private int noOfMirrors;
	private int noOfAlarms;
	private double priceOfDoor;

	public PgDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 52;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof PgDTO) {
				PgDTO c = (PgDTO) obj;
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

	public int getOwnerAge() {
		return ownerAge;
	}

	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getNoOfPeopleStaying() {
		return noOfPeopleStaying;
	}

	public void setNoOfPeopleStaying(int noOfPeopleStaying) {
		this.noOfPeopleStaying = noOfPeopleStaying;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfHouseKeeping() {
		return noOfHouseKeeping;
	}

	public void setNoOfHouseKeeping(int noOfHouseKeeping) {
		this.noOfHouseKeeping = noOfHouseKeeping;
	}

	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBreakFastTiming() {
		return breakFastTiming;
	}

	public void setBreakFastTiming(String breakFastTiming) {
		this.breakFastTiming = breakFastTiming;
	}

	public String getLunchTimings() {
		return lunchTimings;
	}

	public void setLunchTimings(String lunchTimings) {
		this.lunchTimings = lunchTimings;
	}

	public String getDinnerTimings() {
		return dinnerTimings;
	}

	public void setDinnerTimings(String dinnerTimings) {
		this.dinnerTimings = dinnerTimings;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public int getTotalNoOfRooms() {
		return totalNoOfRooms;
	}

	public void setTotalNoOfRooms(int totalNoOfRooms) {
		this.totalNoOfRooms = totalNoOfRooms;
	}

	public int getNoOfRoomsInGroundFloor() {
		return noOfRoomsInGroundFloor;
	}

	public void setNoOfRoomsInGroundFloor(int noOfRoomsInGroundFloor) {
		this.noOfRoomsInGroundFloor = noOfRoomsInGroundFloor;
	}

	public int getNoOfRoomsInFirstFloor() {
		return noOfRoomsInFirstFloor;
	}

	public void setNoOfRoomsInFirstFloor(int noOfRoomsInFirstFloor) {
		this.noOfRoomsInFirstFloor = noOfRoomsInFirstFloor;
	}

	public int getNoOfRoomsInSecondFloor() {
		return noOfRoomsInSecondFloor;
	}

	public void setNoOfRoomsInSecondFloor(int noOfRoomsInSecondFloor) {
		this.noOfRoomsInSecondFloor = noOfRoomsInSecondFloor;
	}

	public int getNoOfRoomsInThirdFloor() {
		return noOfRoomsInThirdFloor;
	}

	public void setNoOfRoomsInThirdFloor(int noOfRoomsInThirdFloor) {
		this.noOfRoomsInThirdFloor = noOfRoomsInThirdFloor;
	}

	public int getNoOfSharing() {
		return noOfSharing;
	}

	public void setNoOfSharing(int noOfSharing) {
		this.noOfSharing = noOfSharing;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getTotalNoOfFans() {
		return totalNoOfFans;
	}

	public void setTotalNoOfFans(int totalNoOfFans) {
		this.totalNoOfFans = totalNoOfFans;
	}

	public int getTotalNoOfcots() {
		return totalNoOfcots;
	}

	public void setTotalNoOfcots(int totalNoOfcots) {
		this.totalNoOfcots = totalNoOfcots;
	}

	public int getTotalNoOfBeds() {
		return totalNoOfBeds;
	}

	public void setTotalNoOfBeds(int totalNoOfBeds) {
		this.totalNoOfBeds = totalNoOfBeds;
	}

	public int getTotalNoOfChairs() {
		return totalNoOfChairs;
	}

	public void setTotalNoOfChairs(int totalNoOfChairs) {
		this.totalNoOfChairs = totalNoOfChairs;
	}

	public int getTotalNoOfWindows() {
		return totalNoOfWindows;
	}

	public void setTotalNoOfWindows(int totalNoOfWindows) {
		this.totalNoOfWindows = totalNoOfWindows;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public int getNoOfSteps() {
		return noOfSteps;
	}

	public void setNoOfSteps(int noOfSteps) {
		this.noOfSteps = noOfSteps;
	}

	public int getNoOfSolarHeaters() {
		return noOfSolarHeaters;
	}

	public void setNoOfSolarHeaters(int noOfSolarHeaters) {
		this.noOfSolarHeaters = noOfSolarHeaters;
	}

	public int getNoOfTaps() {
		return noOfTaps;
	}

	public void setNoOfTaps(int noOfTaps) {
		this.noOfTaps = noOfTaps;
	}

	public int getNoOfDrums() {
		return noOfDrums;
	}

	public void setNoOfDrums(int noOfDrums) {
		this.noOfDrums = noOfDrums;
	}

	public int getNoOfDb() {
		return noOfDb;
	}

	public void setNoOfDb(int noOfDb) {
		this.noOfDb = noOfDb;
	}

	public boolean isGenerator() {
		return generator;
	}

	public void setGenerator(boolean generator) {
		this.generator = generator;
	}

	public int getNoOfSwitches() {
		return noOfSwitches;
	}

	public void setNoOfSwitches(int noOfSwitches) {
		this.noOfSwitches = noOfSwitches;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public String getTypeOfWindow() {
		return typeOfWindow;
	}

	public void setTypeOfWindow(String typeOfWindow) {
		this.typeOfWindow = typeOfWindow;
	}

	public String getTypeOfDoor() {
		return typeOfDoor;
	}

	public void setTypeOfDoor(String typeOfDoor) {
		this.typeOfDoor = typeOfDoor;
	}

	public int getNoOfCodes() {
		return noOfCodes;
	}

	public void setNoOfCodes(int noOfCodes) {
		this.noOfCodes = noOfCodes;
	}

	public int getNoOfWashBasins() {
		return noOfWashBasins;
	}

	public void setNoOfWashBasins(int noOfWashBasins) {
		this.noOfWashBasins = noOfWashBasins;
	}

	public int getNoOfMirrors() {
		return noOfMirrors;
	}

	public void setNoOfMirrors(int noOfMirrors) {
		this.noOfMirrors = noOfMirrors;
	}

	public int getNoOfAlarms() {
		return noOfAlarms;
	}

	public void setNoOfAlarms(int noOfAlarms) {
		this.noOfAlarms = noOfAlarms;
	}

	public double getPriceOfDoor() {
		return priceOfDoor;
	}

	public void setPriceOfDoor(double priceOfDoor) {
		this.priceOfDoor = priceOfDoor;
	}

}
