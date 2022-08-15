package com.xworkz.inheritance.task;

public class Institute {
	public String name;
	public double fees;
	public float rating;
	public int noOfTrainers;
	public int noOfstudents;

	public Institute(String name, double fees, float rating, int noOfTrainers, int noOfstudents) {
		this.name = name;
		this.fees = fees;
		this.rating = rating;
		this.noOfTrainers = noOfTrainers;
		this.noOfstudents = noOfstudents;
	}

	public void torisu() {
		System.out.println(name);
		System.out.println(fees);
		System.out.println(rating);
		System.out.println(noOfTrainers);
		System.out.println(noOfstudents);

	}

}
