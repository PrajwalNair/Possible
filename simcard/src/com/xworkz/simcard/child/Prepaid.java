package com.xworkz.simcard.child;

import com.xworkz.simcard.parent.SimCard;

public class Prepaid extends SimCard {
	@Override
	public void calling() {
		System.out.println("Call from prepaid");

	}

	@Override
	public void network() {
		System.out.println("prepaid network");

	}

	@Override
	public void message() {
		System.out.println("message from prepaid");

	}

	@Override
	public void simService() {
		System.out.println("Sim service in prepaid");

	}

}
