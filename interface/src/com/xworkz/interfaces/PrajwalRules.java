package com.xworkz.interfaces;

public class PrajwalRules implements GymRule {

	@Override
	public double fees() {
		System.out.println("fees");
		return 1;
	}

	@Override
	public boolean unisex() {
		System.out.println("unisex");
		return true;
	}

	@Override
	public boolean wearShoes() {
		System.out.println("wear shoes");
		return true;
	}

}
