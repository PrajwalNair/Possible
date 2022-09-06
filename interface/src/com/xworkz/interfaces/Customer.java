package com.xworkz.interfaces;

public class Customer implements OyoRule {
	@Override
	public double rent() {
		System.out.println("providing rent");
		return 600;
	}

	@Override
	public boolean idProof() {
		System.out.println("providing id proof");
		return true;
	}

	@Override
	public int age() {
		System.out.println("providing age");
		return 23;
	}

}
