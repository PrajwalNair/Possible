package com.xworkz.automobile.base;

public class HondaAutomobile extends Automobile {
	double openTime;
	double closeTime;

	public void setTime(double openTime, double closeTime) {
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	@Override
	public void torisu() {
		super.torisu();
		System.out.println(openTime + " ------ HondaAutomobile class");
		System.out.println(closeTime + " ------ HondaAutomobile class");
	}

}
