package com.xworkz.inheritance.task;

public class Monkey {
	public int noOfEyes;
	public int noOfNose;
	public boolean hair;
	public int noOfLegs;
	public int noOfHands;

	public Monkey(int noOfEyes, int noOfNose, boolean hair, int noOfLegs, int noOfHands) {
		this.noOfEyes = noOfEyes;
		this.noOfNose = noOfNose;
		this.hair = hair;
		this.noOfLegs = noOfLegs;
		this.noOfHands = noOfHands;
	}

	public void torisu() {
		System.out.println(noOfEyes);
		System.out.println(noOfNose);
		System.out.println(hair);
		System.out.println(noOfLegs);
		System.out.println(noOfHands);
	}

}
