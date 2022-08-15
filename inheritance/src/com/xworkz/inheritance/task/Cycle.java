package com.xworkz.inheritance.task;

public class Cycle {
	int noOfWheels;
	int noOfBreaks;
	boolean handle;
	boolean shockAbsorber;
	int noOfMudGuards;

	public Cycle(int noOfWheels, int noOfBreaks, boolean handle, boolean shockAbsorber, int noOfMudGuards) {
		this.noOfWheels = noOfWheels;
		this.noOfBreaks = noOfBreaks;
		this.handle = handle;
		this.shockAbsorber = shockAbsorber;
		this.noOfMudGuards = noOfMudGuards;
	}

	public void torisu() {
		System.out.println(noOfWheels);
		System.out.println(noOfBreaks);
		System.out.println(handle);
		System.out.println(shockAbsorber);
		System.out.println(noOfMudGuards);
	}

}
