package com.xworkz.inheritance.task;

public class Glass {
	public double price;
	public String shape;
	public boolean reflection;
	public String type;
	public String material;

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
