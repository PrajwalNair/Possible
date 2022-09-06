package com.xworkz.dto.data;

import java.io.Serializable;

public class PoliticsDTO implements Serializable {
	private String name;
	private String type;
	private String partyName;
	private String partySymbol;
	private String Office;
	private String area;
	private String country;
	private String state;
	private String city;
	private String district;

	private String taluk;
	private double duration;
	private int followers;
	private int totalBudget;
	private int totalMembers;
	private int totalWorkCompleted;
	private int totalWorkPending;
	private String headQuarter;
	private String chairman;
	private String establishDate;

	private int noOfVoters;
	private String votingDate;
	private boolean security;
	private int noOfFemaleFollowers;
	private int noOfMaleFollowers;
	private int noOfOtherFollowers;
	private String electionDate;
	private String oppositionParty;
	private String partyLeader;
	private String noOfTimesElected;

	private int noOfCars;
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
	
	public PoliticsDTO() {
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

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartySymbol() {
		return partySymbol;
	}

	public void setPartySymbol(String partySymbol) {
		this.partySymbol = partySymbol;
	}

	public String getOffice() {
		return Office;
	}

	public void setOffice(String office) {
		Office = office;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getTotalBudget() {
		return totalBudget;
	}

	public void setTotalBudget(int totalBudget) {
		this.totalBudget = totalBudget;
	}

	public int getTotalMembers() {
		return totalMembers;
	}

	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}

	public int getTotalWorkCompleted() {
		return totalWorkCompleted;
	}

	public void setTotalWorkCompleted(int totalWorkCompleted) {
		this.totalWorkCompleted = totalWorkCompleted;
	}

	public int getTotalWorkPending() {
		return totalWorkPending;
	}

	public void setTotalWorkPending(int totalWorkPending) {
		this.totalWorkPending = totalWorkPending;
	}

	public String getHeadQuarter() {
		return headQuarter;
	}

	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}

	public String getChairman() {
		return chairman;
	}

	public void setChairman(String chairman) {
		this.chairman = chairman;
	}

	public String getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public int getNoOfVoters() {
		return noOfVoters;
	}

	public void setNoOfVoters(int noOfVoters) {
		this.noOfVoters = noOfVoters;
	}

	public String getVotingDate() {
		return votingDate;
	}

	public void setVotingDate(String votingDate) {
		this.votingDate = votingDate;
	}

	public boolean isSecurity() {
		return security;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}

	public int getNoOfFemaleFollowers() {
		return noOfFemaleFollowers;
	}

	public void setNoOfFemaleFollowers(int noOfFemaleFollowers) {
		this.noOfFemaleFollowers = noOfFemaleFollowers;
	}

	public int getNoOfMaleFollowers() {
		return noOfMaleFollowers;
	}

	public void setNoOfMaleFollowers(int noOfMaleFollowers) {
		this.noOfMaleFollowers = noOfMaleFollowers;
	}

	public int getNoOfOtherFollowers() {
		return noOfOtherFollowers;
	}

	public void setNoOfOtherFollowers(int noOfOtherFollowers) {
		this.noOfOtherFollowers = noOfOtherFollowers;
	}

	public String getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}

	public String getOppositionParty() {
		return oppositionParty;
	}

	public void setOppositionParty(String oppositionParty) {
		this.oppositionParty = oppositionParty;
	}

	public String getPartyLeader() {
		return partyLeader;
	}

	public void setPartyLeader(String partyLeader) {
		this.partyLeader = partyLeader;
	}

	public String getNoOfTimesElected() {
		return noOfTimesElected;
	}

	public void setNoOfTimesElected(String noOfTimesElected) {
		this.noOfTimesElected = noOfTimesElected;
	}

	public int getNoOfCars() {
		return noOfCars;
	}

	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
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
	
	

}
