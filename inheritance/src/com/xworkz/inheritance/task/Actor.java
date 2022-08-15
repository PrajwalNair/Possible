package com.xworkz.inheritance.task;

public class Actor {
	public String name;
	public String role;
	public char gender;
	public int noOfFilms;
	public int age;

	public Actor(String name, String role, char gender, int noOfFilms, int age) {
		this.name = name;
		this.role = role;
		this.gender = gender;
		this.noOfFilms = noOfFilms;
		this.age = age;
	}

	public void torisu() {
		System.out.println(name);
		System.out.println(role);
		System.out.println(gender);
		System.out.println(noOfFilms);
		System.out.println(age);
	}

}
