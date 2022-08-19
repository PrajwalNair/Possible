package com.xworkz.onlinesupermarket.subclass;

import com.xworkz.onlinesupermarket.superclass.Market;

public class SuperMarket extends Market{
	public int noOfItems;
	public double rent;
	public boolean security;
	
	public SuperMarket(int noOfItems, double rent, boolean security) {
		super("Big bazar","Grocery","2AAKLH0000Y");
		this.noOfItems=noOfItems;
		this.rent=rent;
		this.security=security;
	}
	
	

}
