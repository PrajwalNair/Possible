package com.xworkz.inheritance.task;

public class Plane {
	public String name;
	public String modeOfTransport;
	public int noOfSeats;
	public boolean pilot;
	public int ageOfPilot;

	public Plane(String name, String modeOfTransport, int noOfSeats, boolean pilot, int ageOfPilot) {
		this.name = name;
		this.modeOfTransport = modeOfTransport;
		this.noOfSeats = noOfSeats;
		this.pilot = pilot;
		this.ageOfPilot = ageOfPilot;
	}

	public void torisu() {
		System.out.println(name);
		System.out.println(modeOfTransport);
		System.out.println(noOfSeats);
		System.out.println(pilot);
		System.out.println(ageOfPilot);
	}

}
