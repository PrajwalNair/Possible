package com.xworkz.interfaces;

public class Staff {
	private OyoRule oyoRule;

	public Staff(OyoRule oyoRule) {
		this.oyoRule = oyoRule;
	}

	public boolean checkRules() {
		double r = oyoRule.rent();
		int a = oyoRule.age();
		boolean i = oyoRule.idProof();
		if (r > 500 && a > 18 && i) {
			System.out.println("Allowed");
			return true;
		} else {
			System.err.println("Not Allowed");
			return false;
		}
	}

}
