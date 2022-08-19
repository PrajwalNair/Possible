package com.xworkz.onlinesupermarket.subclass;

public class OnlineSuperMarket extends SuperMarket {
	public boolean onlinePayment;
	public String appName;
	public double rating;

	public OnlineSuperMarket(boolean onlinePayment, String appName, double rating) {
		super(105, 30000, true);
		this.onlinePayment = onlinePayment;
		this.appName = appName;
		this.rating = rating;

	}

	public void torisu() {
		System.out.println(super.name);
		System.out.println(super.type);
		System.out.println(super.gstNo);
		System.out.println(super.noOfItems);
		System.out.println(super.rent);
		System.out.println(super.security);
		System.out.println(this.onlinePayment);
		System.out.println(this.appName);
		System.out.println(this.rating);
	}

}
