package com.xworkz.interfaces;

public class CustomerPubRule implements PubRules {
	@Override
	public boolean dressCodefollowed() {
		System.out.println("Dress code should be followed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("Age Should be eligible");
		return 22;
	}

	@Override
	public boolean validProof() {
		System.out.println("provide valid proof");
		return true;
	}

}
