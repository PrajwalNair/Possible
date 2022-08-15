package com.xworkz.inheritance.task;

public class Glass {
	double price;
	String shape;
	boolean reflection;
	String type;
	String material;

	public Glass(double price, String shape, boolean reflection, String type, String material) {
		this.price = price;
		this.shape = shape;
		this.reflection = reflection;
		this.type = type;
		this.material = material;

	}

	public void torisu() {
		System.out.println(price);
		System.out.println(shape);
		System.out.println(reflection);
		System.out.println(type);
		System.out.println(material);
	}
}
