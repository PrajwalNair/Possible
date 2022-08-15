package com.xworkz.inheritance.task;

public class Train {
	public String stationName;
	public int noOfCoaches;
	public int noOfSeats;
	public double platformTicket;
	public int noOfStations;

	public Train(String stationName, int noOfCoaches, int noOfSeats, double platformTicket, int noOfStations) {
		this.stationName = stationName;
		this.noOfCoaches = noOfCoaches;
		this.noOfSeats = noOfCoaches;
		this.noOfSeats = noOfSeats;
		this.platformTicket = platformTicket;
		this.noOfStations = noOfStations;
	}

	public void torisu() {
		System.out.println(stationName);
		System.out.println(noOfCoaches);
		System.out.println(noOfSeats);
		System.out.println(platformTicket);
		System.out.println(noOfStations);
	}

}
