package com.xworkz.cricket.parent;

public class Cricket {
	public String country;
	public String captain;
	public char gender;

	public void setCountry(String country) {
		this.country = country;
		System.out.println("Name of the country is " + country + " ------ (parent class)");
	}

	public void setCaptain(String captain) {
		this.captain = captain;
		System.out.println("Name of the captain is " + captain + " ------ (Parent class)");
	}

	public void setGender(char gender) {
		this.gender = gender;
		System.out.println("Type of gender is " + gender + " ------ (parent class)");
	}

	public boolean entertainment() {
		System.out.println("Entertainment from parent " + " ------ (parent class)");
		return false;
	}

	public double presentation() {
		System.out.println("Presentation from parent " + " ------ (parent class)");
		return 1.5;
	}

}
