package com.xworkz.interfaces;

public class GymStaff {
	private GymRule gymRule;

	public GymStaff(GymRule gymRule) {
		this.gymRule = gymRule;
	}

	public boolean checkRules() {
		boolean shoes = gymRule.wearShoes();
		double fees = gymRule.fees();
		boolean allowed = gymRule.unisex();
		if (shoes && fees > 0 && allowed) {
			System.out.println("it is allowed");
			return true;
		} else {
			System.out.println("not allowed");
		}
		return false;

	}

}
