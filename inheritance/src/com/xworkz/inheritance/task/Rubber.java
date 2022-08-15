package com.xworkz.inheritance.task;

public class Rubber {
	public int price;
	public String type;
	public String shape;
	public boolean elastic;
	public float rating;

	public Rubber(int price, String type, String shape, boolean elastic, float rating) {
		this.price = price;
		this.type = type;
		this.shape = shape;
		this.elastic = elastic;
		this.rating = rating;

	}

	public void torisu() {
		System.out.println(price);
		System.out.println(type);
		System.out.println(shape);
		System.out.println(elastic);
		System.out.println(rating);
	}

}
