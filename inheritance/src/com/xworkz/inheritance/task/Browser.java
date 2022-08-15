package com.xworkz.inheritance.task;

public class Browser {
	String name;
	String website;
	boolean open;
	String owned;
	double ipAddress;

	public Browser(String name, String website, boolean open, String owned, double ipAddress) {
		this.name = name;
		this.website = website;
		this.open = open;
		this.owned = owned;
		this.ipAddress = ipAddress;

	}

	public void torisu() {
		System.out.println(name);
		System.out.println(website);
		System.out.println(open);
		System.out.println(owned);
		System.out.println(ipAddress);
	}

}
