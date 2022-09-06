package com.xworkz.interfaces;

public class DownTownPub {
	private PubRules rule;

	public DownTownPub(PubRules rule) {
		this.rule = rule;
	}

	public boolean checkRules() {

		boolean dress = rule.dressCodefollowed();
		int age = rule.age();
		boolean proof = rule.validProof();
		if (dress && age > 21 && proof) {
			System.out.println("Entry is permitted");
			return true;
		} else {
			System.err.println("Entry is not permitted");
		}
		return false;
	}

}
