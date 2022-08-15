package com.xworkz.inheritance.task;

public class Alcohol {
	public String name;
	public String type;
	public double percentageOfAlcohol;
	public double quantity;
	public double price;

	public Alcohol(String name, String type, double percentageOfAlcohol, double quantity, double price) {
		this.name = name;
		this.type = type;
		this.percentageOfAlcohol = percentageOfAlcohol;
		this.quantity = quantity;
		this.price = price;
	}

	public void torisu() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(percentageOfAlcohol);
		System.out.println(quantity);
		System.out.println(price);
	}

}
