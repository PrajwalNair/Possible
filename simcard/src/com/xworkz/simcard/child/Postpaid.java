package com.xworkz.simcard.child;

import com.xworkz.simcard.parent.SimCard;

public class Postpaid extends SimCard {
	@Override
	public void calling() {
		System.out.println("call from postpaid");

	}

	@Override
	public void network() {
		System.out.println("postpaid network");

	}

	@Override
	public void message() {
		System.out.println("message from postpaid");

	}

	@Override
	public void simService() {
		System.out.println("Sim service in postpaid");

	}

}
