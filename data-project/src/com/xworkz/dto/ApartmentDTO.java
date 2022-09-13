package com.xworkz.dto;

import java.io.Serializable;

public class ApartmentDTO implements Serializable {
	private String name;
	private Integer noOfFloors;
	private Integer noOfFlats;
	private Boolean lifts;
	private Boolean waterTank;
	private Double costOfConstruction;
	private Boolean stairCase;
	private Integer noOfDoors;
	private Integer noOfWindows;
	private Integer noOfFans;
	private Boolean fireFighting;
	private Integer noOfLights;
	private Boolean chejja;
	private Boolean Ventilators;
	private Boolean Doors;

	public ApartmentDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ApartmentDTO [name=" + name + ", noOfFloors=" + noOfFloors + ", noOfFlats=" + noOfFlats + ", lifts="
				+ lifts + ", waterTank=" + waterTank + ", costOfConstruction=" + costOfConstruction + ", stairCase="
				+ stairCase + ", noOfDoors=" + noOfDoors + ", noOfWindows=" + noOfWindows + ", noOfFans=" + noOfFans
				+ ", fireFighting=" + fireFighting + ", noOfLights=" + noOfLights + ", chejja=" + chejja
				+ ", Ventilators=" + Ventilators + ", Doors=" + Doors + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Integer getNoOfFlats() {
		return noOfFlats;
	}

	public void setNoOfFlats(Integer noOfFlats) {
		this.noOfFlats = noOfFlats;
	}

	public Boolean getLifts() {
		return lifts;
	}

	public void setLifts(Boolean lifts) {
		this.lifts = lifts;
	}

	public Boolean getWaterTank() {
		return waterTank;
	}

	public void setWaterTank(Boolean waterTank) {
		this.waterTank = waterTank;
	}

	public Double getCostOfConstruction() {
		return costOfConstruction;
	}

	public void setCostOfConstruction(Double costOfConstruction) {
		this.costOfConstruction = costOfConstruction;
	}

	public Boolean getStairCase() {
		return stairCase;
	}

	public void setStairCase(Boolean stairCase) {
		this.stairCase = stairCase;
	}

	public Integer getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(Integer noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public Integer getNoOfWindows() {
		return noOfWindows;
	}

	public void setNoOfWindows(Integer noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public Integer getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(Integer noOfFans) {
		this.noOfFans = noOfFans;
	}

	public Boolean getFireFighting() {
		return fireFighting;
	}

	public void setFireFighting(Boolean fireFighting) {
		this.fireFighting = fireFighting;
	}

	public Integer getNoOfLights() {
		return noOfLights;
	}

	public void setNoOfLights(Integer noOfLights) {
		this.noOfLights = noOfLights;
	}

	public Boolean getChejja() {
		return chejja;
	}

	public void setChejja(Boolean chejja) {
		this.chejja = chejja;
	}

	public Boolean getVentilators() {
		return Ventilators;
	}

	public void setVentilators(Boolean ventilators) {
		Ventilators = ventilators;
	}

	public Boolean getDoors() {
		return Doors;
	}

	public void setDoors(Boolean doors) {
		Doors = doors;
	}

}
