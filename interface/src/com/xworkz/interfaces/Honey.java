package com.xworkz.interfaces;

public class Honey implements HoneyRules {

	@Override
	public double wakeUp() {
		System.out.println("wake up at");
		return 7.0;
	}

	@Override
	public double breakfast() {
		System.out.println("breakfast time");
		return 8.30;
	}

	@Override
	public double lunch() {
		System.out.println("lunch time");
		return 2.00;
	}

	@Override
	public double dinner() {
		System.out.println("dinner time");
		return 9.00;
	}

}
