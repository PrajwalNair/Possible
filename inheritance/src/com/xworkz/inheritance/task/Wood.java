package com.xworkz.inheritance.task;

public class Wood {
	public String type;
	public double price;
	public float rating;
	public String name;
	public double weight;

	public Wood(String type, double price, float rating, String name, double weight) {
		this.type = type;
		this.price = price;
		this.rating = rating;
		this.name = name;
		this.weight = weight;

	}

	public void torisu() {
		System.out.println(type);
		System.out.println(price);
		System.out.println(rating);
		System.out.println(name);
		System.out.println(weight);
	}

}
